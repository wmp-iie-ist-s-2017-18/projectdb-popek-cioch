package Projeckt;

import javafx.beans.property.SimpleStringProperty;

public class Uczniowie {

    private final SimpleStringProperty Imie;
    private SimpleStringProperty Nazwisko;
    private SimpleStringProperty Szko³a;
    private SimpleStringProperty Wiek;

    public Uczniowie(String Imie, String Nazwisko, String Szko³a, String Wiek) {

        this.Imie = new SimpleStringProperty(Imie);
        this.Nazwisko = new SimpleStringProperty(Nazwisko);
        this.Szko³a = new SimpleStringProperty(Szko³a);
        this.Wiek = new SimpleStringProperty(Wiek);
    }

    public String getImie() {
        return Imie.get();

    }

    public String getNazwisko() {
        return Nazwisko.get();

    }

    public String getSzkola() {
        return Szko³a.get();
    }

    public String getWiek() {
        return Wiek.get();
    }

    public void setImie(String value) {
        Imie.set(value);

    }

    public void setNazwisko(String value) {
        Nazwisko.set(value);

    }

    public void setSzkola(String value) {
        Szko³a.set(value);
    }

    public void setWiek(String value) {
        Wiek.set(value);
    }
}
