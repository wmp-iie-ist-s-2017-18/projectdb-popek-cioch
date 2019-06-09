package Kontrolery;

import javafx.beans.property.SimpleStringProperty;

public class Uczniowie {

    String Nr, Imie, Nazwisko, Oceny, Pesel;

    public Uczniowie(String Nr, String Imie, String Nazwisko, String Oceny, String Pesel) {
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.Nr = Nr;
        this.Oceny = Oceny;
        this.Pesel = Pesel;

    }

    public String getImie() {
        return Imie;

    }

    public void setImie(String Imie) {

        this.Imie = Imie;

    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public String getNr() {
        return Nr;
    }

    public String getOceny() {
        return Oceny;
    }

    public String getPesel() {
        return Pesel;
    }

    public void setNazwisko(String Nazwisko) {
        this.Nazwisko = Nazwisko;
    }

    public void setNr(String Nr) {
        this.Nr = Nr;
    }

    public void setOceny(String Oceny) {
        this.Oceny = Oceny;
    }

    public void setPesel(String Pesel) {
        this.Pesel = Pesel;
    }
}
