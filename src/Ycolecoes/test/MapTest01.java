package Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
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
