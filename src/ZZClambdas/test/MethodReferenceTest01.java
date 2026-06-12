package ZZClambdas.test;

import ZZClambdas.dominio.Processadores;
import ZZClambdas.service.ProcessadoresComparators;
import java.util.ArrayList;
import java.util.List;

// Jeito de fzr com métedos estáticos
public class MethodReferenceTest01 {
    /*
    Lembra dos Lambdas (óbvio que sim), imagina um lambda melhorado, é uma forna mais curta de escrever
    lambdas, ao invés de você chamar um metodo com lambda, você referencia esse metodo diretamente usando ::

    A sintaxe é um pouco mais confusa que o lambda, mas não é difícil: Classe::metodo ou objeto:: metodo

    Só pode ser usado quando o lambda chama aoenas um metodo, exemplo:
    texto -> texto.length();
    String::length

    Existem 4 tipos de Method Reference, que é esse primeiro, referência a métodos estáticos
     */
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
