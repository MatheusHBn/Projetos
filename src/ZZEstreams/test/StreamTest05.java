package ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    static void main() {
        List<String> stringList = List.of("Um", "Dois", "Tres");
        String[] split = stringList.get(0).split("");
        System.out.println(Arrays.toString(split));

        List<String[]> list = stringList.stream().map(s -> s.split("")).toList();
        Stream<String> stream = Arrays.stream(split);
        List<String> list1 = stringList.stream().map(s -> s.split("")).flatMap(Arrays::stream).toList();

        System.out.println(list1);
    }
}
