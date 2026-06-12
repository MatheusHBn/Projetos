package ZZEstreams.test;

import ZZEstreams.dominio.Jogo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    /*
    Streams, é quando você executa operações em ordem. Olhe o StreamTest01 e esse, você vai perceber que esse está bem
    mais compacto, pois são várias operações em sequência, e bem compacta.
    Existem dois tipos: Operações Intermediárias e Terminais, as intermediárias são as que levem para outro Stream,
    e as Terminais são as que encerram o processo.
    Importante dizer que Stream só pode ser usada uma vez, não da pra usar a mesma mais de uma vez.

    Existem muitas Streams, e se eu fosse escrever todas ia demorar muito, vou falar só das mais importantes:
    Sorted = organiza os dados de acordo com um comparator definido;
    Filter = filtra dependendo da condição que você passar;
    ForEach = é literalmente o for;
    Distinct = remove dados duplicados;
    Map = transforma elementos (de array pra string, para UpperCase, etc.);;
    Limit = limita quantidade;
    Collect = transforma o resultado em coleção;
    Count = conta elementos.

    Enfim, existem muitas, mas cada uma tem a sua utilidade.
     */
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


