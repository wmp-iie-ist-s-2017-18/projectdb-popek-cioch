package Kontrolery;

import javafx.fxml.FXML;

public class KontrolrelOkna5 {

	 
	
	private KontrolerOkna1 kontrolerOkna1;
	@FXML
	public void back() {
		
		kontrolerOkna1.loadScreen();
		 
	
}
	public void setKontrolerOkna1(KontrolerOkna1 kontrolerOkna1) {
		this.kontrolerOkna1 = kontrolerOkna1;
	}
	
}