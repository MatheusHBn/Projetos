package Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListasSortTest01 {
    /*
    Sort, e utilizado para ordenar uma lista com o equals (dependendo de como você configura o equals),
    apenas usando o Collections.sort(); (mais pra frente veremos outros jeitos de organizar uma lista)
     */
    static void main() {
        List<String> perifericos = new ArrayList<>(20);
        perifericos.add("Mouse");
        perifericos.add("Teclado");
        perifericos.add("Headset");
        perifericos.add("MousePad");
        perifericos.add("Microfone");
        Collections.sort(perifericos);


        List<Double> numeros = new ArrayList<>(20);
        numeros.add(203.6);
        numeros.add(534.6);
        numeros.add(1.5);
        numeros.add(2342.543);
        numeros.add(2342D);
        Collections.sort(numeros);
        for (Double numero: numeros){
            System.out.println(numero);
        }

        for (String periferico: perifericos){
            System.out.println(periferico);
        }
    }
}
