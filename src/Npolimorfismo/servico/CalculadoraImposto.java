package Npolimorfismo.servico;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Laranja;
import Npolimorfismo.dominio.Produto;

public class CalculadoraImposto {
    /*
    Polimorfismo, é até um pouco difícil explicar, então vou usar exemplos

    Imagina o seguinte, você tem um Computador e uma Televisão, e você precisa calcular o imposto que
    os dois vão pagar. Geralmente, você teria que fazer dois métodos diferentes para calcular o imposto
    de cada um.

    Mas ai que entra o polimorfismo, você pode fazer meio que uma assosiação deles, nesse caso, a assosiação
    é que os dois são produtos, então ao inves de você fazer dois métodos diferentes, você faz um metodo para
    Produto, desse jeito, você só faz um metodo, e toods os produtos tem seu imposto calculado

    "Ta, mas como que eu uso isso na prática?" de acordo com o exemplo, você define a classe pai das duas classes
    que você quer corelacionar, depois, basta você fazer: Produto x = new Computador(); ou Produto y = new Televisão();
    porque assim você vai configurar uma classe (que é o produto), mas você pode usar várias classes que derivam dele,
    e isso poupa muito linha de código, muita memso.

    E o polimorfismo tambem funciona em Arrays, Interfaces e em muitas outras coisas, mas só se tiver a mesma lógica do
    polimorfismo geral.
     */
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
