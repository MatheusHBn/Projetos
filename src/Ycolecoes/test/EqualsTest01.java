package Ycolecoes.test;

import Ycolecoes.dominio.Celular;

public class EqualsTest01 {
    /*
    Equals, equals é um metodo que compara dois objetos, enquanto o == geralmente e usado para comparar tipos primitivos.
    O equals tem que ser sobrescrito para comparar coisas mais específicas, como nome, id, etc.
    E ele é muito usado em Collections, como em listas, HashMap, HashSet, para comparação de dados, por exemplo.
     */
    static void main() {
        Celular celular1 = new Celular("945AF", "Samsung");
        Celular celular2 = new Celular("945AF", "Samsung");

        System.out.println(celular1.equals(celular2));
    }
}
