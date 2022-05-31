package pl.sda.arppl4.kolekcje_java.pozostale;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainZbioryZad1_2 {
    public static void main(String[] args) {
// treeset sortuje elementy od majmniejszej do najwiekszej
        Set<Integer> liczby = new TreeSet<>(Arrays.asList(10,12,10,3,4,12,12,300,12,40,55));
        System.out.println("Rozmiar: " + liczby.size());

        for (Integer element : liczby) {
            System.out.println("Element: " + element);

        }
        liczby.remove(10);
        liczby.remove(12);
        System.out.println("Rozmiar: " + liczby.size());
        for (Integer element : liczby) {
            System.out.println("Element: " + element);

        }
}}
