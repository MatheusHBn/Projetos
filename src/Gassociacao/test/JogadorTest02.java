package Gassociacao.test;

import Gassociacao.dominio.Jogador;
import Gassociacao.dominio.Time;

public class JogadorTest02 {
    static void main() {
        Jogador jogador1 = new Jogador("Matheus");
        Time time = new Time("Real Madrid");

        jogador1.setTime(time);
        jogador1.Imprime();
    }
}
