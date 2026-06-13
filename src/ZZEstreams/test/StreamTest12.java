package ZZEstreams.test;

import ZZEstreams.dominio.Categoria;
import ZZEstreams.dominio.Jogo;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest12 {
    static void main() {
        Map<Categoria, List<Jogo>> collect = listJogo.stream().collect(Collectors.groupingBy(Jogo::getCategoria));
        System.out.println(collect);
    }
    private static List<Jogo> listJogo = new ArrayList<>(List.of(
            new Jogo("Cuphead", 10.99, Categoria.MULTIPLAYER),
            new Jogo("Call of Duty: Black Ops 2", 20.75, Categoria.FPS),
            new Jogo("Outer Wilds", 50.20, Categoria.AVENTURA),
            new Jogo("Celeste", 8.5, Categoria.AVENTURA),
            new Jogo("Assasin's Creed: Black Flag", 12.67, Categoria.AVENTURA),
            new Jogo("Tunic", 10.99, Categoria.AVENTURA),
            new Jogo("Clair Obscur: Expedition 33", 40.98, Categoria.AVENTURA),
            new Jogo("Bloons TD 6", 9.99, Categoria.MULTIPLAYER),
            new Jogo("Portal 2", 15.99, Categoria.MULTIPLAYER)));
}
