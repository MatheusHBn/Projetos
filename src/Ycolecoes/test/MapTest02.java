package Ycolecoes.test;

import Ycolecoes.dominio.Consumidor;
import Ycolecoes.dominio.Perifericos;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    static void main() {
        Consumidor consumidor1 = new Consumidor("Matheus");
        Consumidor consumidor2 = new Consumidor("Henrique");


        Perifericos perifericos1 = new Perifericos( 3L,"Mouse", 922.5);
        Perifericos perifericos2 = new Perifericos( 4L,"Teclado", 123.5);
        Perifericos perifericos3 = new Perifericos( 12L,"MousePad", 100.5);
        Perifericos perifericos4 = new Perifericos( 98L,"Headset", 485.5);
        Perifericos perifericos5 = new Perifericos( 45L,"Microfone", 687.5);

        Map<Consumidor, Perifericos> perifericosDoConsumidor = new HashMap<>();
        perifericosDoConsumidor.put(consumidor1, perifericos3);
        perifericosDoConsumidor.put(consumidor2, perifericos5);

        for (Map.Entry<Consumidor, Perifericos> entry : perifericosDoConsumidor.entrySet()){
            System.out.println(entry.getKey().getNome() + " Comprou: " + entry.getValue());
        }
    }
}
