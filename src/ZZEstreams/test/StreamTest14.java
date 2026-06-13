package ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest14 {
    /*
    Aqui mostra a diferença de desempenho entre:
    1- Uma StreamParallel;
    2- Uma Stream normal;
    3- Um For;
    4- Uma LongStream;
    5- Uma LongStreamParallel.

    Quando você executar o código, você vai se perguntar: "Ué, mas em parallel levou mais tempo?" e a resposta é sim,
    porque estamos trabalhando de uma forma que não é ideal, pois estamos iterando de 1 por 1, ai a Thread fica "meio confusa".
    E tambem não tem um tamanho definido, o que dificulta eles de trabalharem.

    E isso é péssimo, pois quanto mais eles demoram pra finalizar o programa, mais memória é consumida, e seu processador também vai lá pros 60%
    (abre o gerenciador de tarefas e executa esse código pra você ver, o Java puxa 4gb de ram no meu pc, e 65% de CPU).

    Para resolver esse problema, utilizaremos o LongStream, que é uma versão especializada de Streams para trabalhar com valores
    primitivos (também existem IntStream, DoubleStream, etc.), podemos usar o Parallel e o LongStram ao mesmo tempo.

    E como podermos ver, o desempenho é melhor que o do For normal, o que significa que o Parallel, quando usado de maneira certa,
    é muito eficiente. Uma lição importante é: Parallel deve ser utilizado em certas situações, pois nem sempre ele é a maneira
    mais eficiente.

    Para descobrir se você deve utilizar ParallelStreams ou não, você deve:
    1- Utilizar Benchmarks, para saber qual metodo é mais eficiente;
    2- Tomar cuidado com boxing e unboxing, isso desperdiça processamento, pois usar o Parallel também usa um certo processamento;
    3- Tome cuidado com certas Streams, como limit e findFirst, elas não foram feitas para trabalhar paralelamente;
    4- Olhe o custo total da computação, pois quando você trabalha com Streams, você vai ter uma quantidade N de elementos e uma
    quantidade P de processamento, se você for usar muito processamento, é bom você usar o Parallel;
    5- Olhe a quantidade de elementos, pois se for poucos elementos, valeria mais a pena não usar Parallel;
    6- Algumas coleções são boas e ruins para usar o Parallel, ArrayList é boa, LinkedList é ruim. Sempre pesquise antes de usar;
    7- Streams de tamanhos definidos são melhores para usar o Parallel
    8-
     */
    static void main() {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long numero = 10_000_0000;
        sumFor(numero);
        sumStreamIterate(numero);
        sumParallelStreamIterate(numero);
        sumLongStreamIterate(numero);
        sumParallelLongStreamIterate(numero);
    }

    private static void sumFor(long num){
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i=1; i <= num; i++){
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumStreamIterate(long num){
        System.out.println("Sum StreamIterate");
        long result = 0;
        long init = System.currentTimeMillis();
        result =  Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumParallelStreamIterate(long num){
        System.out.println("Sum StreamIterate");
        long result = 0;
        long init = System.currentTimeMillis();
        result =  Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumLongStreamIterate(long num){
        System.out.println("Sum LongStreamIterate");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumParallelLongStreamIterate(long num){
        System.out.println("Sum ParallelLongStreamIterate");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }
}
