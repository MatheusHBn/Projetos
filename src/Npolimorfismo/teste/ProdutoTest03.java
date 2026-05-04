package Npolimorfismo.teste;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Laranja;
import Npolimorfismo.dominio.Produto;
import Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    static void main() {
        Produto produto = new Computador("Notebook Lenovo", 3500);

        Laranja produto2 = new Laranja("Verde", 20);
        produto2.setDataValidade("31/05/26");

        CalculadoraImposto.calculaImposto(produto2);
        CalculadoraImposto.calculaImposto(produto);
    }
}
