package ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {

    /*
    Aqui tem uma Stream interessante, sendo o flatMap, ela "achata" estruturas aninhadas (elementos colocados uns dentro
    dos outros, criando níveis)
     */
    static void main() {
        List<List<String>> pessoasGoogle = new ArrayList<>();
        List<String> desenvolvedoresGoogle = List.of("Matheus", "Luis");
        List<String> designersGoogle = List.of("Thiago", "Pedro");
        List<String> estudantesGoogle = List.of("Geovane", "Thierry");

        pessoasGoogle.add(desenvolvedoresGoogle);
        pessoasGoogle.add(designersGoogle);
        pessoasGoogle.add(estudantesGoogle);

        for (List<String> pessoas : pessoasGoogle){
            for (String pessoa : pessoas){
                System.out.println(pessoa);
            }
        }

        System.out.println("-----------------");
        Stream<String> stringStream = pessoasGoogle.stream().flatMap(Collection::stream);
        stringStream.forEach(System.out::println);
        System.out.println(stringStream);
    }
}
