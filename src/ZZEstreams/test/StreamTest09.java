package ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    static void main() {
        IntStream.rangeClosed(1,50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println(" ");
        IntStream.range(1,50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println(" ");
        Stream.of("Saudem", "O", "Poderoso" , "Rei").map(String::toLowerCase).forEach(s -> System.out.print(s + " "));
        System.out.println(" ");
        int[] num = {12,43,65,76};
        Arrays.stream(num).average().ifPresent(System.out::println);

        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))) {

            lines.filter(l -> l.contains("Alguma")).forEach(System.out::println);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
