package Kontrolery;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class KontrolerOkna2 {

    private KontrolerOkna1 kontrolerOkna1;

    @FXML
    public void otwórz1() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Okna/Okno3.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Uczniowe lista");
            stage.setResizable(false);
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML

    public void otwórz2() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Okna/Okno4.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Oceny uczniów");
            stage.setResizable(false);
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        };

    }

    @FXML
    public void otwórz6() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Okna/Okno6.fxml"));
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

    @FXML
    public void otwórz3() {
        System.exit(0);

    }

    public void setKontrolerOkna1(KontrolerOkna1 kontrolerOkna1) {
        this.kontrolerOkna1 = kontrolerOkna1;
    }

    void setScreen(Pane pane) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
