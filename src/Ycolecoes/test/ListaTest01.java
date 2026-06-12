package Ycolecoes.test;

import java.lang.classfile.instruction.CharacterRange;
import java.util.ArrayList;
import java.util.List;

public class ListaTest01 {
    /*
    Um dos tópicos mais interessantes por enquanto, coleções. Tá, mas o que é coleções?

    São estruturas prontas do Java para armazenar e manipular grupos de objetos, importante dizer que Collections e Map
    usam Generics, que dando uma breve resumida, é definir qual o tipo da lista (Integer,String, etc. por isso Wrappers
    são tão importantes, pois não podemos usar tipos primitivos), aqui vai um desenho para ficar de melhor compreensão:

     Collections             Map
          ↑                   ↑
          ↑                HashMap
          ↑                TreeMap
          ↑                 Etc.
          ↑ ←---------------------------
          ↑           ↑              ↑
         List        Set           Queue
          ↑           ↑              ↑
      ArrayList      HashSet      PriorityQueue
      LinkedList     TreeSet

    OBS.: Map não herda Collections

    Mas como estamos no começo, vamos falar de lista. Lista mantém a ordem, permite elementos repetidos e
    possuí um indice, toda lista precisa de uma implementação, e a mais utilizada é a ArrayList, que tem
    metodos importantes, como add() get() remove() size() contains()
    E como é uma ARRAYlist, precisa de um for para imprimir os nomes

    (Importante deixar claro que Collections e Maps são interfaces)

     */
    static void main() {
        List<String> nomes = new ArrayList<>(20);
        List<String> nomes2 = new ArrayList<>(40);
        nomes.add("Matheus");
        nomes.add("Henrique");

        nomes.addAll(nomes2);

        for (String nome: nomes2){
            System.out.println(nome);
            System.out.println("-------------");
        }

        for (String nome : nomes) {
            System.out.println(nome);

        }
        nomes.add("Thiago");
        System.out.println("---------------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

    }
}
