package Kontrolery;

public class oceny {

    String pesel;
    int matematyka, jpolski, jangielski, wf, biologia, geografia;

    public oceny(String pesel, int matematyka, int jpolski, int jangielski, int wf, int biologia, int geografia) {
        this.pesel = pesel;
        this.matematyka = matematyka;
        this.jpolski = jpolski;
        this.jangielski = jangielski;
        this.wf = wf;
        this.biologia = biologia;
        this.geografia = geografia;

    }

    public String getPesel() {
        return pesel;

    }

    public void setPesel(String pesel) {

        this.pesel = pesel;

    }

    public int getMatematyka() {
        return matematyka;
    }

    public int getJpolski() {
        return jpolski;
    }

    public int getJangielski() {
        return jangielski;
    }

    public int getWf() {
        return wf;
    }

    public int getBiologia() {
        return biologia;
    }

    public int getGeografia() {
        return geografia;
    }

    public void setJpolski(int jpolski) {
        this.jpolski = jpolski;
    }

    public void setJangielski(int jangielski) {
        this.jangielski = jangielski;
    }

    public void setWF(int WF) {
        this.wf = wf;
    }

    public void setBiologia(int Biologia) {
        this.biologia = biologia;
    }

    public void setGeografia(int Geografia) {
        this.geografia = geografia;
    }
}
