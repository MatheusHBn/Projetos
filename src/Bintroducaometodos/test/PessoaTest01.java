package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    static void main() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Cibele");
        pessoa.setIdade(19);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
