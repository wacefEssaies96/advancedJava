package surfacePerimetre;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Controller {
	@FXML
	TextField tfLongeur;
	@FXML
	TextField tfLargeur;
	@FXML
	Label textResult;
	
	int longeur;
	int largeur;
	public void surface() throws NumberFormatException {
		try {
			longeur = Integer.parseInt(tfLongeur.getText());
			largeur = Integer.parseInt(tfLargeur.getText());
			String result = ""+longeur*largeur;
			textResult.setText(result);
		}catch(Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Warning alert !");
			alert.setContentText("Vous devez Saisir des integer !");
			alert.show();
		}
		
	}
	public void perimetre() throws NumberFormatException {
		try {
			longeur = Integer.parseInt(tfLongeur.getText());
			largeur = Integer.parseInt(tfLargeur.getText());
			String result = ""+longeur*largeur/2;
			textResult.setText(result);
		}catch(Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Warning alert !");
			alert.setContentText("Vous devez Saisir des integer !");
			alert.show();
		}
		
	}
}
