package Ycolecoes.test;

import Ycolecoes.dominio.Consumidor;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    /*
    NavigableMap, é uma interface que estende a SortedMap, que deixa as chaves ordenadas (diferente de um HashMap)
    alguns metodos úteis são: firstkey(); lastkey(); lowerkey(); higherkey(); floorkey(); ceilingkey();

     */
    static void main() {
        Consumidor consumidor1 = new Consumidor("Matheus");
        Consumidor consumidor2 = new Consumidor("Henrique");
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("UM", "Número 1");
        map.put("DOIS", "Número 2");
        map.put("TRES", "Número 3");
        map.put("QUATRO", "Número 4");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(map.headMap("DOIS"));
        System.out.println(map.higherKey("DOIS"));
    }
}
