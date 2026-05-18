package Ycolecoes.test;

import Ycolecoes.dominio.Perifericos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    static void main() {
      PerifericosPorIdComparator perifericosPorIdComparator =  new PerifericosPorIdComparator();
        List<Perifericos> perifericos = new ArrayList<>(20);
        perifericos.add(new Perifericos( 3L,"Mouse", 922.5));
        perifericos.add(new Perifericos( 4L,"Teclado", 123.5));
        perifericos.add(new Perifericos( 12L,"MousePad", 100.5));
        perifericos.add(new Perifericos( 98L,"Headset", 485.5));
        perifericos.add(new Perifericos( 45L,"Microfone", 687.5));

        Collections.sort(perifericos);
        perifericos.sort(new PerifericosPorIdComparator());
        for (Perifericos periferico: perifericos){
            System.out.println(periferico);
        }

        Perifericos perifericosBusca = new Perifericos(98L, "Headset", 485.5);

        System.out.println(Collections.binarySearch(perifericos, perifericosBusca, perifericosPorIdComparator));
    }
}
