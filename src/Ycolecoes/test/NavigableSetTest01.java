package Ycolecoes.test;

import Ycolecoes.dominio.Celular;
import Ycolecoes.dominio.Perifericos;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class CelularComparador implements Comparator<Celular> {
    @Override
    public int compare(Celular o1, Celular o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class PerifericoComparador implements Comparator<Perifericos>{

    @Override
    public int compare(Perifericos o1, Perifericos o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    static void main() {
        NavigableSet<Celular> set = new TreeSet<>(new CelularComparador());
        Celular celular = new Celular("AB21", "Motorola");
        set.add(celular);
        System.out.println(set);

        NavigableSet<Perifericos> perifericos = new TreeSet<>(new PerifericoComparador());
        perifericos.add(new Perifericos( 3L,"Mouse", 1500));
        perifericos.add(new Perifericos( 4L,"Teclado", 123.5));
        perifericos.add(new Perifericos( 12L,"MousePad", 100.5));
        perifericos.add(new Perifericos( 98L,"Headset", 485.5));
        perifericos.add(new Perifericos( 45L,"Microfone", 687.5));
        perifericos.add(new Perifericos( 59L,"Controle", 687.5));
        for (Perifericos perifericos1 : perifericos){
            System.out.println(perifericos1);
        }
        // metodos interessantes: lower < , floor <= , higher > , ceiling >=
        System.out.println("--------------------\n");
        Perifericos bracoArticulado = new Perifericos( 67L,"Braço Articulado", 1500);
        System.out.println(perifericos.lower(bracoArticulado));
        System.out.println(perifericos.floor(bracoArticulado));
        System.out.println(perifericos.higher(bracoArticulado));
        System.out.println(perifericos.ceiling(bracoArticulado));

        System.out.println("----------------------------------------------");

        System.out.println(perifericos.size());
        System.out.println(perifericos.pollFirst());
        System.out.println(perifericos.size());

    }
}
