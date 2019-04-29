package Kontrolery;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class KontrolerOkna2 {
	
	private KontrolerOkna1 kontrolerOkna1; 
	
	@FXML
	public void otwórz1() {
		
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/Okna/Okno3.fxml"));
		Pane pane = null;
		try {
			 pane = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 KontrolerOkna3 kontrolerOkna3 = loader.getController();
		  
		 kontrolerOkna1.setScreen(pane);
			 
	}
	@FXML
 
	public void otwórz2() {FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/Okna/Okno4.fxml"));
	Pane pane = null;
	try {
		 pane = loader.load();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 KontrolerOkna4 kontrolerOkna4 = loader.getController();
	  
	 kontrolerOkna1.setScreen(pane);
		 
}

	@FXML
	public void otwórz3() {
		 System.exit(0);
		
		
	}

	public void setKontrolerOkna1(KontrolerOkna1 kontrolerOkna1) {
		this.kontrolerOkna1 = kontrolerOkna1;
	}

	@FXML
	public void otwórz4() {FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/Okna/Okno5.fxml"));
	Pane pane = null;
	try {
		 pane = loader.load();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 KontrolerOkna5 kontrolerOkna5 = loader.getController();
	  
	 kontrolerOkna1.setScreen(pane);
		 
}
	 
	}
 

	  
		
 
 
