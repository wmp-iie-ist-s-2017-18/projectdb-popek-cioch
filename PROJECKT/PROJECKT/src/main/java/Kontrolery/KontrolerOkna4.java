package Kontrolery;

import Connect.ConnectionClass;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

 
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
	
	
	
	
	public TextField pes;
	public TextField mat;
	public TextField jpo;
	public TextField jan;
        public TextField wf;

	public TextField bio;	
        public TextField geo;

	
	
	public void dodaj1(ActionEvent event)    {
	try {	
            ConnectionClass connectionClass = new ConnectionClass();
             
                 Connection conn=connectionClass.getConnetion();
                 
                 String sql = "INSERT INTO oceny ( `Pesel`, `matematyka`, `jpolski`, `jangielski`,`wf`,`biologia`,`geografia`) VALUES ('"+pes.getText()+"','"+mat.getText()+"','"+jpo.getText()+"','"+jan.getText()+"','"+wf.getText()+"','"+bio.getText()+"','"+geo.getText()+"')"; 
                 Statement statment = conn.createStatement();
                 statment.executeUpdate(sql);
            octabele();
             } catch (SQLException ex) {
                 Logger.getLogger(KontrolerOkna3.class.getName()).log(Level.SEVERE, null, ex);
             }
	}
        
        @FXML 
        public void delete1(ActionEvent event){
 try {
             ConnectionClass connectionClass = new ConnectionClass();
             
                 Connection conn=connectionClass.getConnetion();
            String sql = "DELETE  FROM oceny WHERE Pesel = '"+pes.getText()+"'";
                   Statement statment = conn.createStatement();
                 statment.executeUpdate(sql);
                 octabele();
	}catch (SQLException ex) {
                 Logger.getLogger(KontrolerOkna3.class.getName()).log(Level.SEVERE, null, ex);
             }}
	
	public void octabele(){
        oclist.clear();
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
        
        }
	
		
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
		 
				
			
			columnpesel.setCellValueFactory(new PropertyValueFactory<oceny,String>("Pesel"));
			columatematyka.setCellValueFactory(new PropertyValueFactory<oceny,String>("matematyka"));
			columjpolski.setCellValueFactory(new PropertyValueFactory<oceny,String>("jpolski"));
			columjangielski.setCellValueFactory(new PropertyValueFactory<oceny,String>("jangielski"));
			columwf.setCellValueFactory(new PropertyValueFactory<oceny,String>("wf"));
			columbiologia.setCellValueFactory(new PropertyValueFactory<oceny,String>("biologia"));
			columgeografia.setCellValueFactory(new PropertyValueFactory<oceny,String>("geografia"));

		 
			tableoceny.setItems(oclist);
			 
		}
		 
			 
		}
		
 