package Ycolecoes.test;

import Ycolecoes.dominio.Perifericos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PerifericosPorIdComparator implements Comparator<Perifericos> {
    @Override
    public int compare(Perifericos periferico1, Perifericos periferico2) {
        return ((Long) periferico1.getId()).compareTo(periferico2.getId());
    }
}

public class PerifericoSortTest01 {
    /*
    Aplicando o Comparator em uma situação real
     */
    static void main() {
        List<Perifericos> perifericos = new ArrayList<>(20);
        perifericos.add(new Perifericos( 3L,"Mouse", 922.5));
        perifericos.add(new Perifericos( 4L,"Teclado", 123.5));
        perifericos.add(new Perifericos( 12L,"MousePad", 100.5));
        perifericos.add(new Perifericos( 98L,"Headset", 485.5));
        perifericos.add(new Perifericos( 45L,"Microfone", 687.5));

        for (Perifericos periferico: perifericos){
            System.out.println(periferico);
        }
        System.out.println("-------------------");
        Collections.sort(perifericos);
        for (Perifericos perifericos1: perifericos){
            System.out.println(perifericos1);
        }
        System.out.println("-------------");
        Collections.sort(perifericos, new PerifericosPorIdComparator());
        for (Perifericos perifericos1: perifericos){
            System.out.println(perifericos1);
        }
    }
}
