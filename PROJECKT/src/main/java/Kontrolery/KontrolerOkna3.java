package Kontrolery;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import Connect.ConnectionClass;
import Projeckt.Uczniowie;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class KontrolerOkna3 implements Initializable {
	@FXML
	private Label label;
	@FXML
	private TableView<Uczniowie> tableUczniowie;
	@FXML
	private TableColumn<Uczniowie, String> kolumnaimie;
	@FXML
	private TableColumn<Uczniowie, String> kolumnanazwisko;
	@FXML
	private TableColumn<Uczniowie, String> kolumnaszkola;
	@FXML
	private TableColumn<Uczniowie, String> kolumnawiek;
	@FXML
	private Button dodaj;
	
	private ObservableList<Uczniowie>data;
	private ConnectionClass dc;
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	dc=new ConnectionClass();  	
	}
	
	
	
	
	private KontrolerOkna1 kontrolerOkna1;
	@FXML
	public void back() {
 
		 System.exit(0);
		
	
}
	
	public void dodaj(ActionEvent event)  {
	  try {
		Connection conn=dc.Connect();
	  data= FXCollections.observableArrayList();
	   ResultSet rs=conn.createStatement().executeQuery("SELECT * FROM zal");
	while (rs.next()) {
		data.add(new Uczniowie(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
		
	}	
	}
	  catch (SQLException ex) {
		System.err.println("Error"+ex);
	  
	
	
	}
	  kolumnaimie.setCellValueFactory(new PropertyValueFactory<>("imie"));
	  kolumnanazwisko.setCellValueFactory(new PropertyValueFactory<>("nazwisko")); 
	  kolumnaszkola.setCellValueFactory(new PropertyValueFactory<>("szkola"));
	  kolumnawiek.setCellValueFactory(new PropertyValueFactory<>("wiek"));
	  tableUczniowie.setItems(null);
	  tableUczniowie.setItems(data);

	}
	public void setKontrolerOkna1(KontrolerOkna1 kontrolerOkna1) {
		this.kontrolerOkna1 = kontrolerOkna1;
	}
	
	
}