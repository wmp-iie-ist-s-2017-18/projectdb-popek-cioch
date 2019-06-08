package Kontrolery;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class KontrolerOkna1 {
	@FXML
	private StackPane Stack;
	@FXML
	public void initialize() {
	loadScreen();
	}
	 
 	public void loadScreen() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/Okna/Okno2.fxml"));	
		Pane pane = null;
		try {
			 pane = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			KontrolerOkna2 kontrolerOkna2 = loader.getController();
			kontrolerOkna2.setKontrolerOkna1(this);
			setScreen(pane);
	}
	public void setScreen(Pane pane) {
		Stack.getChildren().clear();
		Stack.getChildren().add(pane);
	}
 } 
