package Projeckt;

import javafx.beans.property.SimpleStringProperty;

public class Nauczyciele {

    private final SimpleStringProperty Imie;
    private SimpleStringProperty Nazwisko;
    private SimpleStringProperty Przedmiot;
    private SimpleStringProperty PeselNauczyciela;

    public Nauczyciele(String Imie, String Nazwisko, String Przedmiot, String PeselNauczyciela) {

        this.Imie = new SimpleStringProperty(Imie);
        this.Nazwisko = new SimpleStringProperty(Nazwisko);
        this.Przedmiot = new SimpleStringProperty(Przedmiot);
        this.PeselNauczyciela = new SimpleStringProperty(PeselNauczyciela);

    }

    public String getImie() {
        return Imie.get();

    }

    public void setImie(String value) {
        Imie.set(value);

    }

    public void setNazwisko(String value) {
        Nazwisko.set(value);

    }

    public String getNazwisko() {
        return Nazwisko.get();

    }

    public void setPrzedmiot(String value) {
        Nazwisko.set(value);

    }
    
    public String getPrzedmiot() {
        return Przedmiot.get();
    }

    public void setPeselNauczyciela(String value) {
        PeselNauczyciela.set(value);

    }
    
     public String getPeselNauczyciela() {
        return PeselNauczyciela.get();
    }

}
