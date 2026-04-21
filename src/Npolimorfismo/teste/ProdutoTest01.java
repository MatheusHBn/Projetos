package Npolimorfismo.teste;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Laranja;
import Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    static void main() {
        Computador computador = new Computador("Macbook Apple", 10000);
        Laranja laranja = new Laranja("Laranja verde", 8, "28/05/2026");
        CalculadoraImposto.calculaImpostoComputador(computador);
        System.out.println("--------------------------");
        CalculadoraImposto.calculaImpostoLaranja(laranja);
    }
}
