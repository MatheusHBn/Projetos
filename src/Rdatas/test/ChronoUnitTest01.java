package Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    static void main() {
        /*
        LocalDateTime, é uma API moderna do Java que representa data e hora sem fuso horário.
        Ele é a fusão do LocalDate com o LocalTime, e para pegar informações, você pode pegar a hora atual
        usando LocalDateTime.now(); definir horas com o LocalDateTime.of(); usar o .plus para adicionar, usar o .get para pegar mais coisas,
        etc. que nem no calendário, e o LocalDateTime também é imutável
         */
        LocalDateTime festa = LocalDateTime.of(2006, Month.SEPTEMBER, 18,0,0,0);
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(festa, agora));
        System.out.println(ChronoUnit.WEEKS.between(festa, agora));
        System.out.println(ChronoUnit.MONTHS.between(festa, agora));
        System.out.println(ChronoUnit.YEARS.between(festa, agora));


    }
}
