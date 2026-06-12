package Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    static void main() {
        /*
        DateFormat, usado para converter datas para texto, e também transformar texto para datas.
        Que nem os outros, tem o DataFormat.getInstance(); etc. e ele tem os níveis de formatação,
        começando pelo Short, Medium, Long e Full

        Mas ele também é da API antiga do Java, então o LocalDateTime substitui ele.
         */
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateFormat : df){
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
