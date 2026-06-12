package ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    /*
    Lambdas, uma coisa que fiquei muito interessado de estudar. Lambdas são formas curtas de
    escrever uma implementação de uma interface funcional (interface funcional é uma interface
    que tem somente um metodo, porque se tivesse mais de um, o Java ia se confundir)

    A sintaxe do Lambda é bem fácil de pegar: (parâmetro) -> { codigo }
    Sem parâmetro também é fácil: String s -> System.out.println(s);
    o Java descobre os tipos sozinhos, então você não precisa escrever os tipos

    E agora vem a parte mais interessante, que como nós já aprendemos, podemos criar intefarces, então
    basta você criar uma interface funcional e pronto, você pode usar o lambda à vontade
     */
    static void main() {
        List<String> stringList = List.of("Matheus", "Henrique", "Thiago");
        forEach(stringList, s ->  System.out.println(s));
    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e : list){
            consumer.accept(e);
        }
    }
}
