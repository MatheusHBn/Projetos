package Hheranca.teste;

import Hheranca.dominio.Endereco;
import Hheranca.dominio.Funcionario;
import Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    static void main() {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa("Matheus");
        Funcionario funcionario = new Funcionario("Matheus");

        endereco.setRua("Rua Salvador");
        endereco.setCep("044850-234");

        pessoa.setCpf("709.543.768-54");
        pessoa.setEndereco(endereco);

        funcionario.setCpf("840343250-234");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(8372);

        funcionario.imprime();
        pessoa.imprime();
    }
}
