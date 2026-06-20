package Ycolecoes.test;

import Ycolecoes.dominio.Perifericos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    /*
    Iterator, ele é um dos jeitos de percorrer uma coleção, pois ele tem um jeito padrão de fazer isso, e funciona pra
    ticamente em qualquer coleção
    Ele tem alguns métodos principais, que são:
    1- HasNext(); = verifica se tem proximo elemento
    2- next(); = retorna o proximo elemento
    3- remove(); = remove o elemento que tem na coleção (E não, não é bom usar o remove() no for, porque ele vai dar uma
    exception, porque a coleção foi modificada enquanto ela era percorrida).

    Ele é mais utilizado em Sets, já que eles não possuem índice.
     */
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
