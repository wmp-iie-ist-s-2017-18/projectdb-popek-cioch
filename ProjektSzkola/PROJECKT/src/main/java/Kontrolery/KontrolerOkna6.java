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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class KontrolerOkna6 implements Initializable {

    Connection conn;
    ResultSet rs = null;
    PreparedStatement pst = null;

    @FXML
    private Button dodaj;
    @FXML
    private Button delate2;

    @FXML

    public void setKontrolerOkna1(KontrolerOkna1 kontrolerOkna1) {
    }
    @FXML
    private TableView<Nauczyciele> kolumnaNauczyciele;
    @FXML
    private TableColumn<Nauczyciele, String> kolumnaNr;
    @FXML
    private TableColumn<Nauczyciele, String> kolumnaImie;
    @FXML
    private TableColumn<Nauczyciele, String> kolumnaNazwisko;
    @FXML
    private TableColumn<Nauczyciele, String> kolumnaPrzedmiot;
    @FXML
    private TableColumn<Nauczyciele, String> kolumnaPeselNauczyciela;

    /**
     *
     */
    @FXML
    public TextField text1; //imie
    public TextField text2; //nazwisko
    public TextField text3; //przedmiot
    public TextField text4; // pesel
    //public TextField text5; //pesel nauczyciela
    //public TextField text5;

    // private KontrolerOkna1 kontrolerOkna1;
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
            stage.setTitle("Nauczyciele");
            stage.setResizable(false);
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete2(ActionEvent event) {
        try {
            ConnectionClass connectionClass = new ConnectionClass();

            Connection conn = connectionClass.getConnetion();

            //   String sql = "DELETE FROM uczniowie WHERE Pesel = '"+text4.getText()+ "'";
            String sql = "DELETE FROM  nauczyciele WHERE PeselNauczyciela = '" + text4.getText() + "'";

            // WHERE `PeselNauczyciela`
            Statement statment = conn.createStatement();
            statment.executeUpdate(sql);
            odtabele();
        } catch (SQLException ex) {
            Logger.getLogger(KontrolerOkna6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dodaj(ActionEvent event) {
        try {
            ConnectionClass connectionClass = new ConnectionClass();

            Connection conn = connectionClass.getConnetion();

            String sql = "INSERT INTO nauczyciele( `Imie`, `Nazwisko`, `Przedmiot`, `PeselNauczyciela`) VALUES ('" + text1.getText() + "','" + text2.getText() + "','" + text3.getText() + "','" + text4.getText() + "')";

            // INSERT INTO `nauczyciele`(`Nr.`, `Imie`, `Nazwisko`, `Przedmiot`, `PeselNauczyciela`) VALUES
            Statement statment = conn.createStatement();
            statment.executeUpdate(sql);
            odtabele();
        } catch (SQLException ex) {
            Logger.getLogger(KontrolerOkna6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ObservableList<Nauczyciele> oblist = FXCollections.observableArrayList(
            new Nauczyciele("1", "Jan", "Adsssdf", "Matematyka", "5644334348")
    );

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub

        kolumnaNauczyciele.setEditable(true);

        try {
            Connection con = ConnectionClass.getConnetion();

            ResultSet rs = con.createStatement().executeQuery("select * from nauczyciele");

            while (rs.next()) {
                oblist.add(new Nauczyciele(rs.getString("Nr."), rs.getString("Imie"), rs.getString("Nazwisko"), rs.getString("Przedmiot"), rs.getString("PeselNauczyciela")));

                //rs.getString("Nr."),
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        kolumnaNr.setCellValueFactory(new PropertyValueFactory<Nauczyciele, String>("Nr"));
        kolumnaImie.setCellValueFactory(new PropertyValueFactory<Nauczyciele, String>("Imie"));
        kolumnaNazwisko.setCellValueFactory(new PropertyValueFactory<Nauczyciele, String>("Nazwisko"));
        kolumnaPrzedmiot.setCellValueFactory(new PropertyValueFactory<Nauczyciele, String>("Przedmiot"));
        kolumnaPeselNauczyciela.setCellValueFactory(new PropertyValueFactory<Nauczyciele, String>("PeselNauczyciela"));

        kolumnaNauczyciele.setItems(oblist);

    }

    public void odtabele() {
        oblist.clear();
        try {
            Connection con = ConnectionClass.getConnetion();

            ResultSet rs = con.createStatement().executeQuery("select * from nauczyciele");

            while (rs.next()) {
                oblist.add(new Nauczyciele(rs.getString("Nr."), rs.getString("Imie"), rs.getString("Nazwisko"), rs.getString("Przedmiot"), rs.getString("PeselNauczyciela")));

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
