package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main() {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Thiago";
        funcionario.idade = 54;
        funcionario.Dados();
        funcionario.MediaSalario();
    }
}
