package Ycolecoes.test;

import Ycolecoes.dominio.Celular;
import java.util.ArrayList;
import java.util.List;


public class CelularListaTest01 {
    static void main() {


        Celular celular1 = new Celular("5645DF", "Samsung");
        Celular celular2 = new Celular("4F5FAF", "Xiomi");
        Celular celular3 = new Celular("94DG5AF", "Iphone");

        List<Celular> celulares = new ArrayList<>(8);
        celulares.add(celular1);
        celulares.add(celular2);
        celulares.add(celular3);

        for (Celular celular: celulares){
            System.out.println(celular);
        }
        Celular celular4 = new Celular("94DG5AF", "Iphone");
        celulares.addFirst(celular4);

        System.out.println(celulares.contains(celular4));

        System.out.println(celulares.indexOf(celular4));

        System.out.println(celulares.get(celulares.indexOf(celular1)));

        System.out.println(celulares);

    }
}
