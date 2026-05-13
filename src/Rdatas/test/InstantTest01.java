package Rdatas.test;

import java.time.Instant;
import java.time.LocalDate;

public class InstantTest01 {
    static void main() {
        Instant agora = Instant.now();
        System.out.println(agora);
        System.out.println(LocalDate.now());
        System.out.println(agora.getEpochSecond());
        System.out.println(agora.getNano());
        System.out.println(Instant.ofEpochSecond(3, 54545));
        System.out.println(Instant.ofEpochSecond(3, -565764545));
    }
}
