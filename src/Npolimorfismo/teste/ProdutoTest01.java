package Npolimorfismo.teste;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Laranja;
import Npolimorfismo.dominio.Televisao;
import Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    static void main() {
        Computador computador = new Computador("Macbook Apple", 10000);
        Laranja laranja = new Laranja("Laranja verde", 8);
        Televisao tv = new Televisao("LG 54\"", 8500);

        CalculadoraImposto.calculaImposto(computador);
        System.out.println("--------------------------");
        CalculadoraImposto.calculaImposto(laranja);
        System.out.println("-----------------");
        CalculadoraImposto.calculaImposto(tv);
    }
}
