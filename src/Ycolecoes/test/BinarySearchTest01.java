package Ycolecoes.test;

import Ycolecoes.dominio.Perifericos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    static void main() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(754);
        numeros.add(908);
        numeros.add(56);

        Collections.sort(numeros);

        System.out.println(Collections.binarySearch(numeros, 908));
    }
}
