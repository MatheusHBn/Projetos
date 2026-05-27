package ZZEstreams.test;

import ZZEstreams.dominio.Jogo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 1 - Ordenar todos os jogs por nome
// 2 - Trazer os 3 nomes dos jogos que custam menos que 15

public class StreamTest01 {
    private static List<Jogo> listJogo = new ArrayList<>(List.of(
            new Jogo("Cuphead", 10.99),
            new Jogo("Call of Duty: Black Ops 2", 20.75),
            new Jogo("Outer Wilds", 50.20),
            new Jogo("Celeste", 8.5),
            new Jogo("Assasin's Creed: Black Flag", 12.67),
            new Jogo("Tunic", 10.99),
            new Jogo("Clair Obscur: Expedition 33", 40.98),
            new Jogo("Bloons TD 6" , 9.99)));
    static void main() {
        listJogo.sort(Comparator.comparing(Jogo::getName));
        List<String> names = new ArrayList<>();
        for (Jogo listJogo : listJogo){
            if(listJogo.getPrice() <= 15){
                names.add(listJogo.getName());
            }
            if (names.size() >= 3){
                break;
            }
        }
        System.out.println(listJogo);
        System.out.println(names);
    }
}
