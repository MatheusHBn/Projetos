package Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaConversaoArrayTest01 {
    static void main() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(22);
        numeros.add(526);
        Integer[] conversaoArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(conversaoArray));

        // agora lista pra array

        Integer[] numeroArray = new Integer[3];
        numeroArray[0] = 624321;
        numeroArray[1] = 35442;
        numeroArray[2] = 92324;

        List<Integer> arrayLista = Arrays.asList(numeroArray);
        arrayLista.set(1,87);
        System.out.println(Arrays.toString(numeroArray));
        System.out.println(arrayLista);
    }
}
