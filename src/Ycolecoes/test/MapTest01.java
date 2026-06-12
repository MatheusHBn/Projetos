package Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    /*
    Map, ele é uma estrutura que armazena dados no foramto de: chave e valor, um exemplo mais prático é:
    "Matheus", "1"
    "Henrique", "2"
    O primeiro elemento é a chave, enquanto o segundo é o valor, ou seja, a chave identifica o valor
    Diferente de List e Set, no Map é put(); para adicionar elementos
    Para obter o valor da chave, se utliza .get("x"); para verificar se existe valor ou chave, utliza containsKey(); e
    containsValue();
    Não pode repetir chaves, mas pode repitir valores
    As principais implementações são: HashMap, LinkedHashMap e TreeMap
    E para percorrer um Map, o código abaixo demonstra como fazer
     */
    static void main() {
        Map<String, String> map = new HashMap<>();
        map.put("erado","errado");
        map.put("gelu","gelo");
        map.put("visstu","visto");
        System.out.println(map);
        for (String key :map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
        System.out.println("------------------------\n");
        for (String value :map.values()){
            System.out.println(value);
        }
        System.out.println("--------------------------\n");
        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
