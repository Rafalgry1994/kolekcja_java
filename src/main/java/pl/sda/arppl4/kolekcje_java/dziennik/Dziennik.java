package pl.sda.arppl4.kolekcje_java.dziennik;

/**
 * Klasa Dziennik powinna:
 *  * - posiadać (jako pole) listę Studentów.
 *  * - posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta do
 *  * dziennika
 *  * - posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
 *  * - posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerze
 *  * indexu
 *  * - posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer
 *  * indexu studenta, a w wyniku zwraca konkretnego studenta.
 *  * - posiadać metodę 'podajŚredniąStudenta(String):double' która przyjmuje indeks studenta
 *  * i zwraca średnią ocen studenta.
 *  * - posiadać metodę 'podajStudentówZagrożonych():List<Student>'
 *  * - posiadać metodę 'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę
 *  * studentów po numerach indeksów, a następnie zwraca posortowaną listę.
 */

import com.sun.source.tree.BreakTree;

import java.util.*;

public class Dziennik {
    private Map<String, Student> mapaStudentow = new HashMap<>();

    public void dodajStudenta(String numerIndeksu, String imie, String nazwisko) {
        if (mapaStudentow.containsKey(numerIndeksu)) {
            System.err.println("Student o podanym numerzeindeksu już istnieje");
        } else {
            mapaStudentow.put(numerIndeksu, new Student(numerIndeksu, imie, nazwisko));

        }
    }

    public void wypiszListeStudentow() {
        System.out.println("Lista studentów:");
        for (Student student : mapaStudentow.values()) {
            System.out.println(student);
        }
    }

    public void usunStudenta(String numerIndeksu) {
        if (mapaStudentow.containsKey(numerIndeksu)) {
            mapaStudentow.remove(numerIndeksu);
            System.out.println("Usunięto studenta z numerem indeksu" + numerIndeksu);
        } else {
            System.err.println("Student o podanym numerze indeksu nie istnieje");

        }
    }

    public Optional<Student> zwrocStudenta(String indeks) {
        if (mapaStudentow.containsKey(indeks)) {
            System.out.println("Znaleziono studenta z numerem indeksu" + indeks);
            return Optional.of(mapaStudentow.get(indeks));

        } else {
            System.err.println("Student nie istnieje o podanym numerze indeksu");
            return Optional.empty();
        }
    }

    public Optional<Double> podajŚredniąStudenta(String numerIndeksu) {
        if (mapaStudentow.containsKey(numerIndeksu)) {
            System.out.println("Znaleziono studenta z numerem indeksu" + numerIndeksu);

            Student student = mapaStudentow.get(numerIndeksu);
            List<Double> listaOcenStudenta = student.getListaOcen();
            if (listaOcenStudenta.isEmpty()) {
                return Optional.empty();

            }
            double suma = 0.0;
            for (Double ocena : listaOcenStudenta) {
                suma += ocena;

            }
            double srednia = suma / listaOcenStudenta.size();
            return Optional.of(srednia);

        }
        return Optional.empty();

    }

    public void dodajOcene(String numerIndeksu, double ocena) {
        if (!mapaStudentow.containsKey(numerIndeksu)) {
            System.err.printf("Funkcja nie zwróciła średniej ");
        } else {
            Student student = mapaStudentow.get(numerIndeksu);
            student.getListaOcen().add(ocena);
            System.out.println("Dodano ocene");
        }}


        public List<Student> podajStudentowZagrozonych () {
            List<Student> listaZagrozonych = new ArrayList<>();

            for (Student student : mapaStudentow.values()) {
                Optional<Double> optionalSrednia = podajŚredniąStudenta(student.getIndeks());
                if (optionalSrednia.isPresent()) {
                    double srednia = optionalSrednia.get();
                    if (srednia <= 2.0) {
                        listaZagrozonych.add(student);
                    }
                }
            }
            return listaZagrozonych;
        }
    }