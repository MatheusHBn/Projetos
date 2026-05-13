package Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarioTest01 {
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
