package pl.sda.arppl4.kolekcje_java.pozostale;

public class Panstwo {
    private String nazwa;
    private String stolica;
    private int liczbaLidnosci;

    public Panstwo(String nazwa, String stolica, int liczbaLidnosci) {
        this.nazwa = nazwa;
        this.stolica = stolica;
        this.liczbaLidnosci = liczbaLidnosci;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getStolica() {
        return stolica;
    }

    public void setStolica(String stolica) {
        this.stolica = stolica;
    }

    public int getLiczbaLidnosci() {
        return liczbaLidnosci;
    }

    public void setLiczbaLidnosci(int liczbaLidnosci) {
        this.liczbaLidnosci = liczbaLidnosci;
    }

    @Override
    public String toString() {
        return "Panstwo{" +
                "nazwa='" + nazwa + '\'' +
                ", stolica='" + stolica + '\'' +
                ", liczbaLidnosci=" + liczbaLidnosci +
                '}';
    }
}
