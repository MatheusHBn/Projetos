package Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    /*
    LocalTime, é usado para guardar o tempo, usado igual ao LocalDateTime(tirando a parte das datas)
     */
    static void main() {
        LocalTime tempoAgora = LocalTime.now();
       LocalTime tempo =  LocalTime.of(12, 43, 45);
        System.out.println(tempo);
        System.out.println(tempoAgora);
        System.out.println(tempo.getHour());
        System.out.println(tempo.getMinute());
        System.out.println(tempo.getSecond());
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
    }
}
