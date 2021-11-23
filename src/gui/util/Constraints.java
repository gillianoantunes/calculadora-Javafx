package gui.util;

import javafx.scene.control.TextField;

public class Constraints {
	// Listener executado toda vez que mexer no TextField
	// verifica se valor novo newvalue não é nulo e é inteiro \\d*
	// d significa ineiro e asterisco quantos forem os digitos
	// se for nulo ou nao inteiro volta ao valor antigo
	public static void setTextFieldInteger(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*")) {
				txt.setText(oldValue);
			}
		});
	}

	// verifica se valor de max exemplo for 8 , se digitar mais que 8 caracteres
	// volta ao valor antigo
	public static void setTextFieldMaxLength(TextField txt, int max) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && newValue.length() > max) {
				txt.setText(oldValue);
			}
		});
	}

	// verifica se é double igual ao inteiro só a expresao regular que muda
	// expressao regular para double "\\d*([\\.]\\d*)?" inteiro com ponto flutuante
	// e mais digitos
	public static void setTextFieldDouble(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {
				txt.setText(oldValue);
			}
		});
	}
	//la no controlador ViewController tem que implementar inicializable
}
