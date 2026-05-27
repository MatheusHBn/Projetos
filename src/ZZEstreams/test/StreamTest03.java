package ZZEstreams.test;

import ZZEstreams.dominio.Jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<Jogo> listJogo = new ArrayList<>(List.of(
            new Jogo("Cuphead", 10.99),
            new Jogo("Call of Duty: Black Ops 2", 20.75),
            new Jogo("Outer Wilds", 50.20),
            new Jogo("Celeste", 8.5),
            new Jogo("Assasin's Creed: Black Flag", 12.67),
            new Jogo("Tunic", 10.99),
            new Jogo("Clair Obscur: Expedition 33", 40.98),
            new Jogo("Bloons TD 6", 9.99)));

    static void main() {
        Stream<Jogo> stream = listJogo.stream();
        listJogo.stream().forEach(System.out::println);
        long count1 = listJogo.stream()
                .distinct()
                .filter(listJogo -> listJogo.getPrice() <= 15)
                .count();
        System.out.println(count1);
    }
}
