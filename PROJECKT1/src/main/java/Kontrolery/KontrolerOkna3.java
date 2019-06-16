package Kontrolery;

import Connect.ConnectionClass;
import java.awt.event.MouseEvent;
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
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class KontrolerOkna3 implements Initializable {

    Connection conn;
    ResultSet rs = null;
    PreparedStatement pst = null;

    @FXML
    private Button dodaj;
    @FXML
    private Button delete;

    @FXML
    public void setKontrolerOkna1(KontrolerOkna1 kontrolerOkna1) {
    }
    @FXML
    private TableView<Uczniowie> kolumnaUczniowie;
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
    public TextField text1;
    public TextField text2;
    public TextField text3;
    public TextField text4; //delete
    public TextField text5;

    private KontrolerOkna1 kontrolerOkna1;

    @FXML
    public void back() {

        System.exit(0);

    }
 
   
    @FXML
    public void wstecz(ActionEvent event) throws Exception {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Okna/Okno2.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            
            Stage stage = new Stage();
            stage.setTitle("Uczniowie");
            stage.setResizable(false);
            stage.setScene(new Scene(root1));
            stage.show();
          
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(ActionEvent event) {
        try { 
             kolumnaUczniowie.getItems();
               
             text4.setText(kolumnaUczniowie.getSelectionModel().getSelectedItem().getOceny());
             text1.setText(kolumnaUczniowie.getSelectionModel().getSelectedItem().getImie());
             text2.setText(kolumnaUczniowie.getSelectionModel().getSelectedItem().getNazwisko());
             text3.setText(kolumnaUczniowie.getSelectionModel().getSelectedItem().getPesel());

            
            
            ConnectionClass connectionClass = new ConnectionClass();

            Connection conn = connectionClass.getConnetion();
            String sql = "DELETE FROM uczniowie WHERE Pesel = '" + text4.getText() + "'";
            Statement statment = conn.createStatement();
            statment.executeUpdate(sql);
            odtabele();
        } catch (SQLException ex) {
            System.out.println("");
        }
        
    }
   
  
    private void alert1(ActionEvent event){
    Alert a1 = new Alert(Alert.AlertType.ERROR);
    a1.setTitle("B³ad dodawania !!!");
    a1.setContentText(null);
    a1.setHeaderText(" Podaj w³aœciwe dane!!!!");
    a1.showAndWait();
    
    }
    
     
    public void dodaj(ActionEvent event){
        try {
            ConnectionClass connectionClass = new ConnectionClass();

            Connection conn = connectionClass.getConnetion();
            
            String sql =  "CALL `dod`('"+ text1.getText() +"','"+ text2.getText() + "','" + text4.getText() + "','" + text3.getText() + "')";
            Statement statment = conn.createStatement();
            statment.executeUpdate(sql);
            odtabele();
        } catch (SQLException ex) {
            alert1(event);
        }
    }

    ObservableList<Uczniowie> oblist = FXCollections.observableArrayList(
            new Uczniowie("1", "Jan", "5", "6", "5648")
    );
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub

        kolumnaUczniowie.setEditable(true);
        

        try {
            Connection con = ConnectionClass.getConnetion();

            ResultSet rs = con.createStatement().executeQuery("select * from uczniowie");

            while (rs.next()) {
                oblist.add(new Uczniowie(rs.getString("Nr."), rs.getString("Imie"), rs.getString("Nazwisko"), rs.getString("Pesel"), rs.getString("Oceny")));

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        kolumnaNr.setCellValueFactory(new PropertyValueFactory<Uczniowie, String>("Nr"));
        kolumnaImie.setCellValueFactory(new PropertyValueFactory<Uczniowie, String>("Imie"));
        kolumnaNazwisko.setCellValueFactory(new PropertyValueFactory<Uczniowie, String>("Nazwisko"));
        kolumnaPesel.setCellValueFactory(new PropertyValueFactory<Uczniowie, String>("Pesel"));
        kolumnaOcena.setCellValueFactory(new PropertyValueFactory<Uczniowie, String>("Oceny"));
       
        kolumnaUczniowie.setItems(oblist);
        
    }

    public void odtabele() {
        oblist.clear();
        try {
            Connection con = ConnectionClass.getConnetion();

            ResultSet rs = con.createStatement().executeQuery("select * from uczniowie");

            while (rs.next()) {
                oblist.add(new Uczniowie(rs.getString("Nr."), rs.getString("Imie"), rs.getString("Nazwisko"), rs.getString("Pesel"), rs.getString("Oceny")));

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        kolumnaUczniowie.setItems(oblist);
    }

}
