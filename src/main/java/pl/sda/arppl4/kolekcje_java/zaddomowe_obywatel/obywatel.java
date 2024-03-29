package pl.sda.arppl4.kolekcje_java.zaddomowe_obywatel;

import java.util.Objects;

public class obywatel {
    private String imie;
    private String nazwisko;
    private String pesel;

    public obywatel(String imie, String nazwisko, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        obywatel obywatel = (obywatel) o;
        return Objects.equals(pesel, obywatel.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }

    @Override
    public String toString() {
        return "Obywatel{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}

