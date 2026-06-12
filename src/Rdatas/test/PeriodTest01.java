package Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    /*
    Period, usado para representar um intervalo de tempo baseado em datas.
    Mas aí vem a pergunta: "Mas o Durantion já não faz isso?", fazer ele faz, mas a diferença é que Duration
    usa períodos pequenos, como horas e minutos, já o Period trabalha com anos, meses e dias
    Funciona que nem o Duration, mas a diferença é que você usa anos, meses e dias
     */
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
