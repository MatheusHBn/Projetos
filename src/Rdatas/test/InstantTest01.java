package Rdatas.test;

import java.time.Instant;
import java.time.LocalDate;

public class InstantTest01 {
    /*
    Instant, ele basicamente representa um instante exato no tempo
    O z que vier significa "Fuso horário Zero", e assim como o Date, ele tambem exibe os milisegundos
    desde 1/1/1970, e o resto você já sabe, tem comparações, soma e subtração de instantes, etc.
    Ele serve para pegar o instante em que o mesmo evento ocorreu em diferentes partes do mundo
     */
    static void main(){
        Instant agora = Instant.now();
        System.out.println(agora);
        System.out.println(LocalDate.now());
        System.out.println(agora.getEpochSecond());
        System.out.println(agora.getNano());
        System.out.println(Instant.ofEpochSecond(3, 54545));
        System.out.println(Instant.ofEpochSecond(3, -565764545));
    }
}
