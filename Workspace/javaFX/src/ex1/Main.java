package ex1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
@Override
public void start(Stage primaryStage) {
	try {
		VBox vb = new VBox();
		Scene scene = new Scene(vb);
		
		HBox hb1 = new HBox();
		hb1.setSpacing(10);
		hb1.setPadding(new Insets(20));
		Label l = new Label("your name");
		TextField tf = new TextField();
		hb1.getChildren().addAll(l,tf);
		
		HBox hb2 = new HBox();
		hb2.setSpacing(10);
		hb2.setPadding(new Insets(20));
		Button b = new Button("say hello");
		Label l2 = new Label();
		hb2.getChildren().addAll(b,l2);
		/*b.setOnAction(new EventHandler() {
			public void handle(ActionEvent event) {
				l2.setText("hello "+tf.getText());
			}
		});*/
		// 1ere méthode
		b.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				l2.setText("hello "+tf.getText());
			}
		});
		// 2 éme méthode (avec les éxpressions lambda)
		b.setOnAction(event-> { l2.setText("hello "+tf.getText());} );
		
		vb.getChildren().addAll(hb1,hb2);
		//vb.getChildren().add(hb2);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("hello");
		primaryStage.setScene(scene);
		primaryStage.show();
	} catch(Exception e) {
		e.printStackTrace();
	}
}


public static void main(String[] args) {
	launch(args);
}
}
