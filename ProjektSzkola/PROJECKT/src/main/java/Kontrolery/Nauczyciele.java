package Kontrolery;

public class Nauczyciele {

    String Nr;
    String Imie;
    String Nazwisko;
    String Przedmiot;
    String PeselNauczyciela;

    public Nauczyciele(String Nr, String Imie, String Nazwisko, String Przedmiot, String PeselNauczyciela) {

        this.Nr = Nr;
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.Przedmiot = Przedmiot;
        this.PeselNauczyciela = PeselNauczyciela;

    }

    public String getNr() {
        return Nr;
    }

    public void setNr(String Nr) {
        this.Nr = Nr;
    }

    public String getImie() {
        return Imie;

    }

    public String getNazwisko() {
        return Nazwisko;

    }

    public String getPrzedmiot() {
        return Przedmiot;
    }

    public String getPeselNauczyciela() {
        return PeselNauczyciela;
    }

    public void setImie(String Imie) {
        this.Imie = Imie;

    }

    public void setNazwisko(String Nazwisko) {
        this.Nazwisko = Nazwisko;

    }

    public void setPrzedmiot(String Przedmiot) {
        this.Przedmiot = Przedmiot;

    }

    public void setPeselNauczyciela(String PeselNauczyciela) {
        this.PeselNauczyciela = PeselNauczyciela;

    }

}
