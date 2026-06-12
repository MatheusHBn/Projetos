package Eblocosinicializacao.teste;

import Eblocosinicializacao.dominio.Computadores;

public class ComputadoresTest {
    static void main() {
        /*
        e como podemos ver, sempre que um objeto é iniciado, ele executa o bloco duas vezes
         */


        Computadores computador = new Computadores("3060 TI");
        Computadores computadores = new Computadores();
    }
}
