package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {23,56,76,323,435,653,323,4,667,8,899};

        calculadora.SomaArray(numeros);
        calculadora.SomaArgs(2,3,5,3,5,556,56,56,56,56,565,65,6,78,56);
    }
}
