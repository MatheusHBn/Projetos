package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    static void main() {

        /*
        Para implementar o método, basta voce colocar: calculadora.método().
        e se o método tiver parâmetros, colocar eles, ex: na calculadora, tem os parametros de dois numeros inteiros,
        então, quando você for implementar ele, você tem que colocar os dois números ( (50, 2) ou (numx, numy) )
         */

        Calculadora calculadora = new Calculadora();
        Calculadora calculadora1 = new Calculadora();
        Calculadora calculadora2 = new Calculadora();
        Calculadora calculadora3 = new Calculadora();

        calculadora1.subtracao();

        calculadora.soma();

        calculadora2.multiplicacao(12,95);

        double result = calculadora3.divisao(2977.5, 1);
        System.out.println(result);
        calculadora.ImprimeDivisao(98,0);


    }
}
