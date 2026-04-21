package Npolimorfismo.teste;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Laranja;
import Npolimorfismo.dominio.Produto;

public class ProdutoTest02 {
    static void main() {
        Produto produto = new Computador("Notebook Lenovo", 3500);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("---------------");

        Produto produto2 = new Laranja("Verde", 20, "28/05/26");
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

    }
}
