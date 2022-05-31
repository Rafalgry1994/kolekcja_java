package pl.sda.arppl4.kolekcje_java.ZadanieSlowa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Stwórz Main'a (MainSetSlowa) użytkownik ma wpisać jedną linię tekstu ze scannera:
 * -wczytaj linię tekstu
 * -podziel linię na słowa
 * -wypisz unikalne słowa wpisane przez użytkownika
 * -wypisz unikalne litery wpisane przez użytkownika
 */
public class MainSetSlowa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String tekstWpisany = scanner.nextLine();
        String tekstBezPrzecinkow = tekstWpisany.replaceAll(",", "");
        String tekstBezPrzecinkowIKropek = tekstBezPrzecinkow.replaceAll("[.]", "");

        String[] tablicaSłów = tekstWpisany.split(" ");
        Set<String> zbiorSlow = new HashSet<>(Arrays.asList(tablicaSłów));
        System.out.println(zbiorSlow);


    }
}
