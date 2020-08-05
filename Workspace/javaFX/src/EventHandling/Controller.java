package EventHandling;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;


public class Controller {

	@FXML
	TextArea result;
	
	public void insert(){
		String a = "A";
		result.setText(result.getText()+a);
	}
	public void delete(){
		result.setText(result.getText().substring(0 , result.getText().length()-1));
	}
	public void quit(){
		Platform.exit();
	}
	
}
