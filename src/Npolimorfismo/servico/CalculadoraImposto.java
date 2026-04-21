package Npolimorfismo.servico;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Laranja;

public class CalculadoraImposto {
    public static void calculaImpostoComputador(Computador computador){
        System.out.println("Relatório de Imposto do Computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: "+ computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto a ser pago: "+ imposto);
    }

    public static void calculaImpostoLaranja(Laranja laranja){
        System.out.println("Relatório de Imposto do Computador");
        double imposto = laranja.calcularImposto();
        System.out.println("Laranja: "+ laranja.getNome());
        System.out.println("Valor: " + laranja.getValor());
        System.out.println("Imposto a ser pago: "+ imposto);
    }
}
