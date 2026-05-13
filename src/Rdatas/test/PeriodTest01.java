package Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    static void main() {
        LocalDate agora = LocalDate.now();
        LocalDate agoraDepoisDoisAnos = LocalDate.now().plusYears(2).plusMonths(4);
        Period p1 = Period.between(agora, agoraDepoisDoisAnos);
        Period p2 = Period.ofDays(4);
        Period p3 = Period.ofWeeks(57);
        Period p4 = Period.ofMonths(7);
        Period p5 = Period.ofYears(29);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        System.out.println(agora.until(agora.plusDays(p3.getDays()), ChronoUnit.YEARS));
    }
}
