package Kontrolery;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import Connect.ConnectionClass;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

public class KontrolerOkna4 implements Initializable {
 
	
	Connection conn;
	ResultSet rs = null;
	PreparedStatement pst =null;
	
	@FXML
	private TableView<oceny>  tableoceny;
	@FXML
	private TableColumn<oceny, String> columnpesel;
	@FXML
	private TableColumn<oceny, String> columatematyka;
	@FXML
	private TableColumn<oceny, String> columjpolski;
	@FXML
	private TableColumn<oceny, String> columjangielski;
	@FXML
	private TableColumn<oceny, String> columwf;
	@FXML
	private TableColumn<oceny, String> columbiologia;
	@FXML
	private TableColumn<oceny, String> columgeografia;
	@FXML 
	 
	
	
	
	
	
	
	
	
	
		
		private KontrolerOkna1 kontrolerOkna1;
		@FXML
		public void back1() {
			
			 System.exit(0);
		
	}
		public void setKontrolerOkna1(KontrolerOkna1 kontrolerOkna1) {
			this.kontrolerOkna1 = kontrolerOkna1;
		}
		ObservableList<oceny> oclist = FXCollections.observableArrayList(
				new oceny("9566466146",3,2,4,5,2,4)
				 
				);
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
			
			tableoceny.setEditable(true);
			columnpesel.setCellFactory(TextFieldTableCell.forTableColumn());
			
			try {
			Connection con = ConnectionClass.getConnetion();
			 
				ResultSet rs = con.createStatement().executeQuery("select * from oceny");
			
			while (rs.next()) {
				oclist.add(new oceny(rs.getString("Pesel"),rs.getInt("matematyka"),rs.getInt("jpolski"),rs.getInt("jangielski"),rs.getInt("wf"),rs.getInt("biologia"),rs.getInt("geografia")));
			
			
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
				
			
			columnpesel.setCellValueFactory(new PropertyValueFactory<>("Pesel"));
			columatematyka.setCellValueFactory(new PropertyValueFactory<>("matematyka"));
			columjpolski.setCellValueFactory(new PropertyValueFactory<>("jpolski"));
			columjangielski.setCellValueFactory(new PropertyValueFactory<>("jangielski"));
			columwf.setCellValueFactory(new PropertyValueFactory<>("wf"));
			columbiologia.setCellValueFactory(new PropertyValueFactory<>("biologia"));
			columgeografia.setCellValueFactory(new PropertyValueFactory<>("geografia"));

		 
			tableoceny.setItems(oclist);
			 
		}
		
}