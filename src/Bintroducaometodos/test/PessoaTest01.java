package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    static void main() {
        /*
        E também, você pode resgatar os getters e setters, se o objeto tiver os dois em questão
         */

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Cibele");
        pessoa.setIdade(19);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
