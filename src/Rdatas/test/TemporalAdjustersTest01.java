package Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    /*
    TemporalAdjusters, usado para arrumar datas automaticamente, principalmente para:
    primeiro dia do ano, ultimo dia do mes proxima segunda-feira, etc.
     */
    static void main() {
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());
    }
}
