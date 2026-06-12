package Ycolecoes.test;

import Ycolecoes.dominio.Perifericos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    /*
    Set, é uma coleção que não permite elementos duplicados, não possuí indice e a ordem depende da implementação
    as implementações principais são HashSet, LinkedHashSet e TreeSet
     */
    static void main() {
        Set<Perifericos> perifericos = new LinkedHashSet<>();
        perifericos.add(new Perifericos( 3L,"Mouse", 922.5, 0));
        perifericos.add(new Perifericos( 4L,"Teclado", 123.5, 34));
        perifericos.add(new Perifericos( 12L,"MousePad", 100.5, 0));
        perifericos.add(new Perifericos( 12L,"MousePad", 100.5, 0));
        perifericos.add(new Perifericos( 45L,"Microfone", 687.5, 200));

        for (Perifericos perifericos1 : perifericos){
            System.out.println(perifericos1);
        }
    }
}
