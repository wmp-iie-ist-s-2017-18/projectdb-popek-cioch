package Projeckt;

import java.sql.DriverManager;

import com.sun.corba.se.pept.transport.Connection;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
 
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Aut o-generated method stub
		launch(args);
		
	}
	 
	        
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("/Okna/Okno1.fxml"));
		StackPane stackPane = loader.load();
		Scene scene = new Scene(stackPane);
		scene.getStylesheets().add("/Okna/styles/Style.css");
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	 
	
}