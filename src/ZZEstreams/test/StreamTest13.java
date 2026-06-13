package ZZEstreams.test;

import ZZEstreams.dominio.Categoria;
import ZZEstreams.dominio.Jogo;
import ZZEstreams.dominio.Promocao;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static ZZEstreams.dominio.Promocao.*;

public class StreamTest13 {
    static void main() {
        Map<Promocao, List<Jogo>> collect = listJogo.stream().
                collect(Collectors.groupingBy(ln -> ln.getPrice() > 30 ? TRINTA_DESCONTO : PRECO_NORMAL
                ));
        System.out.println(collect);

        // como fazer pra filtrar dependendo do desconto e categoria? ( ou Ma<Categoria, Map<Promocao, List<Jogo>>> )

        Map<Categoria, Map<Promocao, List<Jogo>>> collected = listJogo.stream()
                .collect(Collectors.groupingBy(Jogo::getCategoria,
                        Collectors.groupingBy(ln -> ln.getPrice() > 30 ? TRINTA_DESCONTO : PRECO_NORMAL)));

        System.out.println(collected);


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
