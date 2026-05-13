package Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    static void main() {
        LocalDateTime festa = LocalDateTime.of(2006, Month.SEPTEMBER, 18,0,0,0);
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(festa, agora));
        System.out.println(ChronoUnit.WEEKS.between(festa, agora));
        System.out.println(ChronoUnit.MONTHS.between(festa, agora));
        System.out.println(ChronoUnit.YEARS.between(festa, agora));


    }
}
