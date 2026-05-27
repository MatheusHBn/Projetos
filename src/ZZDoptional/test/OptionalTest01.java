package ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    static void main() {
        Optional<String> optional = Optional.of("Arraia de esqueleto");
        Optional<String> optional2 = Optional.ofNullable(null);
        System.out.println(optional);
        System.out.println(optional2);

        Optional<String> nameOptional = findname("Matheus");
        String empty = nameOptional.orElse("EMPTY");
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(empty);
    }


    private static Optional<String> findname(String name){
        List<String> list = List.of("Matheus", "Henrique");
        int i = list.indexOf(name);
        if (i != -1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
