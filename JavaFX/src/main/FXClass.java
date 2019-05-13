package main;

import java.awt.*;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FXClass extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		// creating label
		Label label = new Label ("This is a lable");
		Button button1 = new Button("Button 1");
		Button button2 = new Button("Button 2");
		
		// Put the control in an HBOX
		
		HBox hbox = new HBox (10);
		

		
		
		
		
		
		// Create a scene
		
		Scene scene = new Scene(hbox);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
	}

}
