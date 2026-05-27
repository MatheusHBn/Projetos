package ZZEstreams.test;

import java.util.List;
import java.util.Optional;

public class StreamTest07 {
    static void main() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Optional<Integer> reduce = integers.stream().reduce((Integer::sum));
        reduce.ifPresent(System.out::println);

      integers.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);

    }
}
