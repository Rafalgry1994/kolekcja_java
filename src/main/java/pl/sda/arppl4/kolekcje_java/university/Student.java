package pl.sda.arppl4.kolekcje_java.university;

public class Student {
    private Long numerIndeksu;
    private String imie;
    private String nazwisko;

    public Student(Long numerIndeksu, String imie, String nazwisko) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Long getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(Long numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Student{" +
                "numerIndeksu=" + numerIndeksu +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
