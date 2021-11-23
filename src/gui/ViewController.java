package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//implementa para verificar constrains da um erro e adiciona o metodo
//esse metodo executa quando o controlador for criado

public class ViewController implements Initializable {
	
	@FXML
	private TextField txtFirstNumber;
	
	@FXML
	private TextField txtSecondNumber;

	@FXML
	private Button btSoma;
	
	@FXML
	private Button btSubtracao;
	
	@FXML
	private Button btMultiplica;
	
	@FXML
	private Button btDividi;
	
	@FXML
	private Label labelResultado;
	

	
	@FXML
	public void onBtSomaAction() {
		Locale.setDefault(Locale.US);
		Double num1 = Double.parseDouble(txtFirstNumber.getText());
		Double num2 =  Double.parseDouble(txtSecondNumber.getText());
		Double soma = num1 + num2;
		labelResultado.setText(String.format("%.2f",soma));
	}
	public void onBtSubtracaoAction() {
		Locale.setDefault(Locale.US);
		Double num1 = Double.parseDouble(txtFirstNumber.getText());
		Double num2 =  Double.parseDouble(txtSecondNumber.getText());
		Double sub = num1 - num2;
		labelResultado.setText(String.format("%.2f",sub));
	}
	public void onBtMultiplicaAction() {
		Locale.setDefault(Locale.US);
		Double num1 = Double.parseDouble(txtFirstNumber.getText());
		Double num2 =  Double.parseDouble(txtSecondNumber.getText());
		Double multi = num1 * num2;
		labelResultado.setText(String.format("%.2f",multi));
	}
	public void onBtDividiAction() {
		Locale.setDefault(Locale.US);
		Double num1 = Double.parseDouble(txtFirstNumber.getText());
		Double num2 =  Double.parseDouble(txtSecondNumber.getText());
		Double dividi = num1 / num2;
		labelResultado.setText(String.format("%.2f",dividi));
	}
	
	//execulta quando o controlador for criado
	//url é o caminho da tela
	//ResouceBundle é os recursos que podemos usar mas nuca mexemos
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//chama os metodos que verificam o que o usuario esta digitando no txtFisrtNumber e txtSecondNumber
		//só deixa digitar números nos campos da calculadora
		Constraints.setTextFieldDouble(txtFirstNumber);
		Constraints.setTextFieldDouble(txtSecondNumber);
		//so deixa digitar 5 caracteres nos campos
		Constraints.setTextFieldMaxLength(txtFirstNumber, 5);
		Constraints.setTextFieldMaxLength(txtSecondNumber, 5);
	}
	
	
	
}
