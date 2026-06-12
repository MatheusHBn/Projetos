package ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    /*
    Aqui estão mais exemplos de lambdas, e algumas interfaces funcionais muito usadas são: Consumer, Supplier
    Predicate, Function
     */
    static void main() {
        List<String> strings = List.of("Matheus" , "Thiago");
        List<Integer> map = map(strings, s -> s.length());
        List<String> map1 = map(strings, s -> s.toUpperCase());
        System.out.println(map + " \n" + map1);

    }

    private static <T , R> List<R> map(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for (T e : list){
            R apply = function.apply(e);
            result.add(apply);
        }
        return result;

    }
}
