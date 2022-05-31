package pl.sda.arppl4.kolekcje_java.pozostale;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // mapa: Nazwa Kraju -> Obiekt z informacjami o państwie
        Map<String, Panstwo> mapa = new HashMap<>();

        // umieszczenie elementu
        Panstwo polskaPanstwo = new Panstwo("Polska", "Warszawa", 3);
        mapa.put("Polska", polskaPanstwo);
        mapa.put("Niemcy", new Panstwo("Niemcy", "Berlin", 5));
        mapa.put("Czechy", new Panstwo("Czechy", "Praga", 1));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę kraju");
        String nazwaKraju = scanner.next();
        // pobieranie warotści z mapy

        if (mapa.containsKey(nazwaKraju)) {
            Panstwo obiektPanstwo = mapa.get(nazwaKraju);
            //System.out.println(obiektPanstwo);
            System.out.println("Ilość obywateli: " + obiektPanstwo.getLiczbaLidnosci());
        }else{
            System.err.println("Podany kraj nie istanieje");
        }
    }
}