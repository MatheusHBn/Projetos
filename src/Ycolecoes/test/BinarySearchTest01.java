package Ycolecoes.test;

import Ycolecoes.dominio.Perifericos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    /*
    BinarySearch, é um algorítimo usado para encontrar elementos numa coleção ordenada (tem que ser obrigatóriamente ordenada)
    por exemplo: numa lista de 0 a 10, vamos supor que eu queira achar o número 3, ele vai ir na metade da lista (5) e
    vai ver se o 3 é > ou <. e qual lado for verdadeiro, ele descarta o outro, então só sobraria 0 1 2 3 4, e vai repetindo
    até achar o 3
    O retorno pode ser: a posição que o 3 está, ou aonde o número que não foi achado deveria estar, mas com o -1, então fica
    -(x) - 1
     */
    static void main() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(754);
        numeros.add(908);
        numeros.add(56);

        Collections.sort(numeros);

        System.out.println(Collections.binarySearch(numeros, 754));
    }
}
