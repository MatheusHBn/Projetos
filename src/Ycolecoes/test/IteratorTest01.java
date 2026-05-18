package Ycolecoes.test;

import Ycolecoes.dominio.Perifericos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    static void main() {
        List<Perifericos> perifericos = new ArrayList<>(20);
        perifericos.add(new Perifericos( 3L,"Mouse", 922.5, 0));
        perifericos.add(new Perifericos( 4L,"Teclado", 123.5, 34));
        perifericos.add(new Perifericos( 12L,"MousePad", 100.5, 0));
        perifericos.add(new Perifericos( 98L,"Headset", 485.5, 98));
        perifericos.add(new Perifericos( 45L,"Microfone", 687.5, 200));

//        Iterator<Perifericos> iterator = perifericos.iterator();
//        while(iterator.hasNext()){
//            Perifericos perifericos1 =  iterator.next();
//            if (perifericos1.getQuantidade()== 0 ){
//                iterator.remove();
//            }
//        }
        perifericos.removeIf(perifericos1 -> perifericos1.getQuantidade() == 0);
        System.out.println(perifericos);
    }
}
