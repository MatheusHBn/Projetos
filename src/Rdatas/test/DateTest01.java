package Rdatas.test;

import java.util.Date;

public class DateTest01 {
    static void main() {
        Date date = new Date(1778016433763L);
        date.setTime(date.getTime() + 3600000);

        System.out.println(date);
    }
}
