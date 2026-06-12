package Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarioTest01 {
    /*
    Essa vai ser a parte de data, começando com o Calendar, que é menos usado, pois existem o LocalDate,
    LocalDateTime, etc. mas enfim.

    Calendar, usado para ver horário, pegar dias, meses e anos, comparar datas, etc.
    inicializado sem o new, o certo é Calendar.getInstance(); ai depois você usa o .get para
    pegar os anos, etc.

    Ele não é tão usado porque ele é de uma API antiga do Java, então ele é mais ou menos difícil de usar,
    os meses começam no 0, não é imutável, enfim, vários problemas, mas felizmente tem outros jeitos melhores de
    conseguir pegar tudo que ele pega
     */
    static void main() {
        Calendar calendar = Calendar.getInstance();
    if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
        System.out.println("Domingo é o primeiro dia");
    }
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        calendar.add(Calendar.DAY_OF_MONTH, 0);
        calendar.add(Calendar.HOUR, 6);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
