package pl.sda.arppl4.kolekcje_java.pozostale;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<String> zbiór = new HashSet<>();
        zbiór.add("Polska");
        zbiór.add("Czechy");
        zbiór.add("Ukraina");
        zbiór.add("Niemcy");
        zbiór.add("Francja");
        zbiór.add("Czechy");
        zbiór.add("Polska");
        zbiór.add("Czechy");
        zbiór.add("Ukraina");
        zbiór.add("Polska");
        zbiór.add("Czechy");

        System.out.println(zbiór);

    }
}
