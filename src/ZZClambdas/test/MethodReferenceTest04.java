package ZZClambdas.test;

import ZZClambdas.dominio.Processadores;
import ZZClambdas.service.ProcessadoresComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    /*
    E o quarto tipo é: Referência a um construtor, esse substitui o " = new X();" por "X::new"
     */
    static void main() {
        Supplier<ProcessadoresComparators> newProcessadoresComparator = ProcessadoresComparators::new;
        ProcessadoresComparators processadoresComparators = newProcessadoresComparator.get();
        List<Processadores> processadoresList = new ArrayList<>(List.of(
                new Processadores("Ryzen 5", "3500X"),
                new Processadores("Ryzen 7", "7700X"),
                new Processadores("Intel 5", "10400K")));
        processadoresList.sort(processadoresComparators::compareByModelNoStatic);
        System.out.println(processadoresList);

        BiFunction<String, String, Processadores> processadoresBiFunction = (name, model) -> new Processadores(name, model);
        BiFunction<String, String, Processadores> processadoresBiFunction2 = Processadores::new;
        System.out.println(processadoresBiFunction.apply("Ryzen 5" , "3500X"));
    }
}
