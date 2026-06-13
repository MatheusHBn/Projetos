package ZZEstreams.test;

import ZZEstreams.dominio.Jogo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    static void main() {
        System.out.println(listJogo.stream().collect(Collectors.counting()));

        listJogo.stream().max(Comparator.comparing(Jogo::getPrice)).ifPresent(System.out::println);

        listJogo.stream().collect(Collectors.maxBy(Comparator.comparing(Jogo::getPrice)));

        System.out.println(listJogo.stream().mapToDouble(Jogo::getPrice).sum());
        listJogo.stream().mapToDouble(Jogo::getPrice).average().ifPresent(System.out::println);

        System.out.println( listJogo.stream().collect(Collectors.summingDouble(Jogo::getPrice)));
        System.out.println( listJogo.stream().collect(Collectors.averagingDouble(Jogo::getPrice)));

        DoubleSummaryStatistics collect = listJogo.stream().collect(Collectors.summarizingDouble(Jogo::getPrice));
        System.out.println(collect);

        String collected = listJogo.stream().map(Jogo::getName).collect(Collectors.joining(", "));
        System.out.println(collected);
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
