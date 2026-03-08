package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        int num1 = 4;
        int num2 = 10;
        calculadora.AlteraDados(num1, num2);
        System.out.println(num1);
        System.out.println(num2);

    }
}
