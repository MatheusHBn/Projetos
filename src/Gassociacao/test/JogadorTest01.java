package Gassociacao.test;

import Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    static void main() {
        Jogador jogador1 = new Jogador("Matheus");
        Jogador jogador2 = new Jogador("Afonso");
        Jogador jogador3 = new Jogador("Jonas");

        Jogador[] jogadores = new Jogador[]{jogador1,jogador2,jogador3};

        for (Jogador jogador: jogadores){
            jogador.Imprime();
        }
    }
}
