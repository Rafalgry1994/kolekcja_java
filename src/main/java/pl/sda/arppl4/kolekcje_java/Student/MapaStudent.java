package pl.sda.arppl4.kolekcje_java.Student;

import java.util.HashMap;
import java.util.Map;

public class MapaStudent {
    public static void main(String[] args) {
        Map<Long, Student> mapa = new HashMap<>();
        mapa.put(123321L, new Student(123321L, "Pawel", "Gawel"));
        mapa.put(1243321L, new Student(1243321L, "Gawel", "Piotr"));
        mapa.put(156321L, new Student(156321L, "Marian", "Nowak"));
        mapa.put(167321L, new Student(167321L, "Mirek", "Kowal"));

        // mapa iteracja:
// 1. Klucze
        System.out.println("Klucze:");
        for (Long indeks : mapa.keySet()) {
            System.out.print(indeks + " ");
        }
        System.out.println();

// 2. Wartości
        System.out.println("Wartości:");
        for (Student student : mapa.values()) {
            System.out.print(student + " ");
        }
        System.out.println();

// 3. Pary Klucz-Wartość - Entry - Wpis/Rekord
        for (Map.Entry<Long, Student> wpis : mapa.entrySet()) {

        }
    }
}
