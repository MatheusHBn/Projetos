package ZZEstreams.test;

import ZZEstreams.dominio.Jogo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamTest06 {
    /*
    Outras Streams interessantes, AnyMatch, AllMatch e NoneMatch:
    AnyMatch = verifica se pelo menos um elemento atende a condição;
    allMatch = verifica se todos atendem;
    NoneMatch = verifica se nenhum atende.
     */
    static void main() {
        System.out.println(listJogo.stream().anyMatch(lj -> lj.getPrice() > 12));
        System.out.println(listJogo.stream().allMatch(lj -> lj.getPrice() > 5));
        System.out.println(listJogo.stream().noneMatch(lj -> lj.getPrice() > 79));

        Optional<Jogo> optionalJogo = listJogo.stream().filter(lj -> lj.getPrice() > 3).findAny();
        optionalJogo.ifPresent(System.out::println);
        System.out.println(optionalJogo);

        Optional<Jogo> first = listJogo.stream().filter(lj -> lj.getPrice() > 3).sorted(Comparator.comparing(Jogo::getPrice).reversed()).findFirst(); // é possivel usar o .max() tbm
        first.ifPresent(System.out::println);
        System.out.println(first);
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
