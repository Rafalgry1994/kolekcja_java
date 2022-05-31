package pl.sda.arppl4.kolekcje_java.dziennik;

import lombok.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Student powinna:
 *  * - posiadać listę ocen studenta (List<Double>)
 *  * - posiadać (pole) numer indeksu studenta (String)
 *  * - posiadać (pole) imię studenta
 *  * - posiadać (pole) nazwisko studenta
 */

@Data //getter,setter, tostring, equalsandhashcode,
      // requiredarguscostructor = wymagany,nezbedny,potrzebny
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private List<Double> listaOcen = new ArrayList<>();
    private String indeks;
    private String imie;
    private String nazwisko;

    public Student(String indeks, String imie, String nazwisko) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
}
