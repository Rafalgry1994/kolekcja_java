package pl.sda.arppl4.kolekcje_java.ParaLiczb;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainParaLiczb {
    public static void main(String[] args) {

        ParaLiczb p1 = new ParaLiczb(1,2);
        ParaLiczb p2 = new ParaLiczb(2,1);
        ParaLiczb p3= new ParaLiczb(1,2);
        ParaLiczb p4 = new ParaLiczb(1,1);

        Set<ParaLiczb> zbiorParLiczb = new HashSet<>();
        zbiorParLiczb.add(p1);
        zbiorParLiczb.add(p2);
        zbiorParLiczb.add(p3);
        zbiorParLiczb.add(p4);

        System.out.println("Ilość: " + zbiorParLiczb.size());
        String a;

    }
}
