package listView;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
	ListView<String> listView;
	@FXML
	TextField tfName;
	
	
	public void ajouter() throws Exception{

		if(tfName.getText().equals("")) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fail");
			alert.setContentText("Veuillez donner un nom");
			alert.show();
		}
		else {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Success");
			alert.setContentText("Vous étes sur d'ajouter : "+tfName.getText());
			alert.show();
			ObservableList<ButtonType> tab = alert.getButtonTypes();
			//System.out.println(tab.getButtonType());
			listView.getItems().add(tfName.getText());
			tfName.setText("");
		}
		
		
		
		
	}
	
}
