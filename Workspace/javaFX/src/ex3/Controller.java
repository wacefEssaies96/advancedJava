package ex3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
		
	@FXML
	TextField tfUserName;
	@FXML
	TextField tfPassword;
	@FXML
	Label textResult;
	
	public void test() {
		if(tfUserName.getText().equals("wacef") && tfPassword.getText().equals("password")) {
			textResult.setText("Hello "+tfUserName.getText());
		}else {
			textResult.setText("Wrong Username or password !");
		}
	}

	
	
}
