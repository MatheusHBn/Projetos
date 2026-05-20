package ZZAclassesinternas.test;


import Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class NomeComparatorbBarco implements Comparator<Barco> {
    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class AnonymousClassesTest02 {
    static void main() {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Canoa") , new Barco("Caiaque")));
        barcoList.sort((o1, o2) -> 0);
        System.out.println(barcoList);
    }
}
