package ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    /*
    O segundo tipo de Method Reference é: Referência a metodo de um objeto específico
    E o terceiro é: Referência a metodo de instância de uma classe
     */
    static void main() {
        List<String> strings = new ArrayList<>(List.of("Matheus", "Henrique", "Thiago"));
        strings.sort(String::compareTo);
        System.out.println(strings);

        Function<String, Integer> listNumString = Integer::parseInt;
        System.out.println(listNumString.apply("20"));

        BiPredicate<List<String>, String> listCheckName = List::contains;
        System.out.println(listCheckName.test(strings, "Matheus"));

    }
}
