package Npolimorfismo.servico;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Laranja;
import Npolimorfismo.dominio.Produto;

public class CalculadoraImposto {
    public static void calculaImposto(Produto produto){
        System.out.println("Relátorio do Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: "+ imposto);
        if (produto instanceof Laranja) {
            System.out.println(((Laranja)produto).getDataValidade());
        }
    }
}
