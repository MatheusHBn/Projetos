package Zgenerics.test;

import Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    static void main() {
        // type erasure, <String>  <-- isso ai é uma Generic
        List<String> lista = new ArrayList<>();
        lista.add("Matheus");
        lista.add("Henrique");

        for (String o : lista){
            System.out.println(lista);
        }

        add(lista, new Consumidor("Thiago"));

        for (Object o : lista){
            System.out.println(lista);
        }

    }
        private static void add(List lista, Consumidor consumidor){
            lista.add(consumidor);
        }
}
