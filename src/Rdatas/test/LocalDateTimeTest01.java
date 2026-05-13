package Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    static void main() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate data = LocalDate.of(2027, Month.DECEMBER, 23);
        LocalTime tempo = LocalTime.of(15, 34, 2);
        LocalDateTime hora1 = data.atTime(tempo);
        LocalDateTime hora2 = tempo.atDate(data);
        System.out.println(hora1);
        System.out.println(hora2);
    }
}
