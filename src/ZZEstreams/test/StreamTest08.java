package ZZEstreams.test;

import ZZEstreams.dominio.Jogo;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    static void main() {
        listJogo.stream().map(Jogo::getPrice).filter(price -> price > 18).reduce(Double::sum).ifPresent(System.out::println);
        double sum = listJogo.stream().mapToDouble(Jogo::getPrice).filter(price -> price > 18).sum();
        System.out.println(sum);
    }

    private static List<Jogo> listJogo = new ArrayList<>(List.of(
            new Jogo("Cuphead", 10.99),
            new Jogo("Call of Duty: Black Ops 2", 20.75),
            new Jogo("Outer Wilds", 50.20),
            new Jogo("Celeste", 8.5),
            new Jogo("Assasin's Creed: Black Flag", 12.67),
            new Jogo("Tunic", 10.99),
            new Jogo("Clair Obscur: Expedition 33", 40.98),
            new Jogo("Bloons TD 6", 9.99)));
}
