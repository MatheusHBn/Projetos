package Gassociacao.test;

import Gassociacao.dominio.Jogador;
import Gassociacao.dominio.Time;

public class JogadorTest03 {
    static void main() {
        Jogador jogador = new Jogador("Matheus");
        Jogador jogador1 = new Jogador("Raul");
        Time time = new Time("PSG");
        Jogador[] jogadores = {jogador,jogador1};

        jogador.setTime(time);
        jogador1.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("------Jodador------");

        jogador.Imprime();

        System.out.println("-----Time----");

        time.imprime();
    }
}
