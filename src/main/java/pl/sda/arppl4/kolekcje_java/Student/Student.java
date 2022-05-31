package pl.sda.arppl4.kolekcje_java.Student;

public class Student {
    private Long numerIndeksu;
    private String imie;
    private String nazwisko;


    public Long getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(Long numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(int imie) {
        this.imie = String.valueOf(imie);
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(int nazwisko) {
        this.nazwisko = String.valueOf(nazwisko);
    }

    @Override
    public String toString() {
        return "Student{" +
                "numerIndeksu=" + numerIndeksu +
                ", imie=" + imie +
                ", nazwisko=" + nazwisko +
                '}';
    }

    public Student(Long numerIndeksu, String imie, String nazwisko) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
}

