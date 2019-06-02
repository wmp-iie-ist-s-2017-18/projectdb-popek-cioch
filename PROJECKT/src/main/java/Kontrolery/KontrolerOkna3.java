package Kontrolery;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

 
import Connect.ConnectionClass;
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
import javafx.scene.control.cell.TextFieldTableCell;

public class KontrolerOkna3 implements Initializable {
	 Connection conn;
	ResultSet rs = null;
	PreparedStatement pst =null;
	
	@FXML
	private Button dodaj;
	@FXML
	private Button delete;
	@FXML
	public void setKontrolerOkna1(KontrolerOkna1 kontrolerOkna1) {
		}
	@FXML
	private TableView<Uczniowie>  kolumnaUczniowie;
	@FXML
	private TableColumn<Uczniowie, String> kolumnaNr;
	@FXML
	private TableColumn<Uczniowie, String> kolumnaImie;
	@FXML
	private TableColumn<Uczniowie, String> kolumnaNazwisko;
	@FXML
	private TableColumn<Uczniowie, String> kolumnaOcena;
	@FXML
	private TableColumn<Uczniowie, String> kolumnaPesel;
	@FXML 
	private TextField text1;
	private TextField text2;
	private TextField text3;
	private TextField text4;
	private TextField text5;
	
	private KontrolerOkna1 kontrolerOkna1;
	@FXML
	public void back() {
 
		 System.exit(0);
 		
	
}
	public void onEdit(TableColumn.CellDataFeatures<Uczniowie, String> uczniowieStringEditEvent){
 
	}
	public void dodaj(ActionEvent event)    {
		 String imie = text1.getText();
		 String nazwisko = text2.getText();
		 String Ocena = text3.getText();
		 String Pesel = text4.getText();
		 try {
		 String query = "INSERT INTO `uczniowie`(`Nr.`, `Imie`, `Nazwisko`, `Pesel`, `Oceny`) VALUES (?,?,?,?,?)";
		 
			pst = conn.prepareStatement(query);
			
			pst.setString(1, "");
			pst.setString(2, text1.getText());
			pst.setString(3, text2.getText());
			pst.setString(4, text3.getText());
			pst.setString(5, text4.getText());
			pst.execute();
			pst.close();
		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	 

	 
	 
	ObservableList<Uczniowie> oblist = FXCollections.observableArrayList(
			new Uczniowie("Kamil","Jan","5","6","5648") 
			 
			);
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		
		kolumnaUczniowie.setEditable(true);
		kolumnaNr.setCellFactory(TextFieldTableCell.forTableColumn());
		
		try {
		Connection con = ConnectionClass.getConnetion();
		 
			ResultSet rs = con.createStatement().executeQuery("select * from uczniowie");
		
		while (rs.next()) {
			oblist.add(new Uczniowie(rs.getString("Nr."),rs.getString("Imie"),rs.getString("Nazwisko"),rs.getString("Pesel"),rs.getString("Oceny")));
		
		
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
			
		
		kolumnaNr.setCellValueFactory(new PropertyValueFactory<>("Nr"));
		kolumnaImie.setCellValueFactory(new PropertyValueFactory<>("Imie"));
		kolumnaNazwisko.setCellValueFactory(new PropertyValueFactory<>("Nazwisko"));
		kolumnaPesel.setCellValueFactory(new PropertyValueFactory<>("Pesel"));
		kolumnaOcena.setCellValueFactory(new PropertyValueFactory<>("Oceny"));

	 
		kolumnaUczniowie.setItems(oblist);
		 
	}
	
	
}