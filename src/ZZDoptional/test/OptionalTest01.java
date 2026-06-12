package ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    /*
    Optional, é uma classe que representa um valor que pode ou não existir, ela foca em evitar NullPointerException

    Você cria um Optional usando Optional.of(), assim você garante que o valor não é nulo. Um Optional.ofNullable() aceita null.
    Optional.empty(); cria um Optional vazio. Também tem o orElse(), é literalmente o "else" do if, que caso não encontre
    o que você mandou, ele faz x comando. E tem o ifPresent(); que só executa algo se existir um valor

     */
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
