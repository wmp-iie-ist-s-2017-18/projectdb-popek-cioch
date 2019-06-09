package Kontrolery;

import javafx.fxml.FXML;

public class KontrolerOkna5 {

    private KontrolerOkna1 kontrolerOkna1;

    @FXML
    public void back() {
        System.exit(0);

    }

    public void setKontrolerOkna1(KontrolerOkna1 kontrolerOkna1) {
        this.kontrolerOkna1 = kontrolerOkna1;
    }

}
