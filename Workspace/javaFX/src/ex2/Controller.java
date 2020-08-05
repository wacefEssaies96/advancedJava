package ex2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
	
	@FXML
	TextField tfName;
	@FXML
	Label LMessage;
	
	public void sayHello() {
		LMessage.setText("Hello "+tfName.getText());
	}
	
}
