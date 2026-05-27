package ZZClambdas.test;

import ZZClambdas.dominio.Processadores;
import ZZClambdas.service.ProcessadoresComparators;
import java.util.ArrayList;
import java.util.List;

// Jeito de fzr sem métodos estáticos
public class MethodReferenceTest02 {
    static void main() {
        ProcessadoresComparators processadoresComparators = new ProcessadoresComparators();
        List<Processadores> processadoresList = new ArrayList<>(List.of(
                new Processadores("Ryzen 5", "3500X"),
                new Processadores("Ryzen 7", "7700X"),
                new Processadores("Intel 5", "10400K")));
        processadoresList.sort(processadoresComparators::compareByModelNoStatic);
        System.out.println(processadoresList);
    }
}
