package Oexcecao.exception.test;

import Oexcecao.exception.dominio.Funcionario;
import Oexcecao.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    static void main() {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
    }
}
