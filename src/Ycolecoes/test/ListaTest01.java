package Ycolecoes.test;

import java.lang.classfile.instruction.CharacterRange;
import java.util.ArrayList;
import java.util.List;

public class ListaTest01 {
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
