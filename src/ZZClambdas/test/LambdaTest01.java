package ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    static void main() {
        List<String> stringList = List.of("Matheus", "Henrique", "Thiago");
        forEach(stringList, s ->  System.out.println(s));
    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e : list){
            consumer.accept(e);
        }
    }
}
