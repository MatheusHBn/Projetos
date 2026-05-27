package ZZEstreams.test;

import ZZEstreams.dominio.Jogo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    static void main() {
        List<String> list = listJogo.stream()
                .sorted(Comparator.comparing(Jogo::getName))
                .filter(listJogo -> listJogo.getPrice() <= 15)
                .limit(3)
                .map(Jogo::getName)
                .collect(Collectors.toList());
        System.out.println(list);
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


