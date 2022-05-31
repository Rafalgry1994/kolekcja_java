package pl.sda.arppl4.kolekcje_java.zaddomowe_obywatel;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<obywatel> obywatelSet = new HashSet<>();
        obywatelSet.add(new obywatel("Jan","Kowalski","123456"));
        obywatelSet.add(new obywatel("Kaziu","Kowalski","123886"));
        obywatelSet.add(new obywatel("Tomek","Kowalski","123006"));
        obywatelSet.add(new obywatel("Marcin","Kowalski","443456"));

        System.out.println("Ilosc:" + obywatelSet.size());
        System.out.println(obywatelSet);

    }
}
