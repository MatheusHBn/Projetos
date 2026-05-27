package ZZClambdas.test;

import ZZClambdas.dominio.Processadores;
import ZZClambdas.service.ProcessadoresComparators;
import java.util.ArrayList;
import java.util.List;

// Jeito de fzr com métedos estáticos
public class MethodReferenceTest01 {
    static void main() {
        List<Processadores> processadoresList = new ArrayList<>(List.of(
                new Processadores("Ryzen 5", "3500X"),
                new Processadores("Ryzen 7", "7700X"),
                new Processadores("Intel 5", "10400K")));
//      Collections.sort(processadoresList, (p1,p2) -> p1.getName().compareTo(p2.getName()));
        processadoresList.sort(ProcessadoresComparators::compareByName);
        processadoresList.sort(ProcessadoresComparators::compareByModel);
        System.out.println(processadoresList);
    }
}
