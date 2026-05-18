package Ycolecoes.test;

import Ycolecoes.dominio.Consumidor;
import Ycolecoes.dominio.Perifericos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    static void main() {
        Consumidor consumidor1 = new Consumidor("Matheus");
        Consumidor consumidor2 = new Consumidor("Henrique");


        Perifericos perifericos1 = new Perifericos(3L, "Mouse", 922.5);
        Perifericos perifericos2 = new Perifericos(4L, "Teclado", 123.5);
        Perifericos perifericos3 = new Perifericos(12L, "MousePad", 100.5);
        Perifericos perifericos4 = new Perifericos(98L, "Headset", 485.5);
        Perifericos perifericos5 = new Perifericos(45L, "Microfone", 687.5);

        List<Perifericos> perifericosLista1 = List.of(perifericos1, perifericos2, perifericos3);
        List<Perifericos> perifericosLista2 = List.of(perifericos4, perifericos5);

        Map<Consumidor, List<Perifericos>> perifericosDoConsumidor = new HashMap<>();
        perifericosDoConsumidor.put(consumidor1, perifericosLista1);
        perifericosDoConsumidor.put(consumidor2, perifericosLista2);

        for (Map.Entry<Consumidor, List<Perifericos>> entry : perifericosDoConsumidor.entrySet()) {
            System.out.println("O usuário: " + entry.getKey().getNome());
            for (Perifericos perifericos : entry.getValue()) {
                System.out.println("Comprou: " + perifericos.getNome());
            }
        }
    }
}
