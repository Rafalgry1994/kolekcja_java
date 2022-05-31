package pl.sda.arppl4.kolekcje_java.dziennik;


import java.util.List;
import java.util.Optional;

/**
 * 3 rodzaje kolekcji : Mapy, Listy, Sety
 *
 * Dziennik Elektryczny:
 * Map<Long, Student>
 *
 * System Ksiąg Wieczystych
 * Map<String, WpisKsiążek>
 *
 * System w których przyjmujemy klientów w kolejce:
 * LinkHashSet - zachowuje kolejniośc wstawiania
 *
 * Stwórz aplikację, a w niej klasę Dziennik i student . Stwórz również klasę Student. Klasa
 * Student powinna:
 * - posiadać listę ocen studenta (List<Double>)
 * - posiadać (pole) numer indeksu studenta (String)
 * - posiadać (pole) imię studenta
 * - posiadać (pole) nazwisko studenta
 * Klasa Dziennik powinna:
 * - posiadać (jako pole) listę Studentów.
 * - posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta do
 * dziennika
 * - posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
 * - posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerze
 * indexu
 * - posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer
 * indexu studenta, a w wyniku zwraca konkretnego studenta.
 * - posiadać metodę 'podajŚredniąStudenta(String):double' która przyjmuje indeks studenta
 * i zwraca średnią ocen studenta.
 * - posiadać metodę 'podajStudentówZagrożonych():List<Student>'
 * - posiadać metodę 'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę
 * studentów po numerach indeksów, a następnie zwraca posortowaną listę.
 */

public class Main {
    public static void main(String[] args) {
        Dziennik dziennik = new Dziennik();

        dziennik.dodajStudenta("123123", "Pawel", "Gawel");

        dziennik.wypiszListeStudentow();

        dziennik.usunStudenta("666666");
        dziennik.usunStudenta("123123");

        Optional<Student> optionalStudent = dziennik.zwrocStudenta("888888");
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            System.out.println("Imie i nazwisko:" + student.getImie() + " " + student.getNazwisko());

        } else {
            System.err.println("Funkcja nie zwróciła studenta");
        }
        Optional<Double> optionalSrenia = dziennik.podajŚredniąStudenta("888888");
        if (optionalSrenia.isPresent()) {
            Double sredniaStudenta = optionalSrenia.get();
            System.out.println("Zwrocona średnia to:" + sredniaStudenta);
        } else {
            System.err.println("Funkcja nie zwróciła średniej");
        }
        dziennik.dodajStudenta("999999", "Pawel", "Gawelek");
        dziennik.dodajOcene("999999", 5.0);
        dziennik.dodajOcene("999999", 3.0);
        dziennik.dodajOcene("999999", 2.1);
        dziennik.dodajOcene("999999", 4.5);

        Optional<Double> optionalSreniaStudenta = dziennik.podajŚredniąStudenta("888888");
        if (optionalSreniaStudenta.isPresent()) {
            Double sredniaStudenta = optionalSreniaStudenta.get();
            System.out.println("Zwrocona średnia to:" + sredniaStudenta);
        } else {
            System.err.println("Funkcja nie zwróciła średniej");
        }
        List<Student> listaZagrozonych = dziennik.podajStudentowZagrozonych();
        System.out.println("Lista zagrożonych: " + listaZagrozonych);
    }
}