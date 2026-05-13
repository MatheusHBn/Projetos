package Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    static void main() {
        Locale locale = new Locale("it", "IT");
        Locale localeSuica = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJap = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");
        Calendar calendar = Calendar.getInstance();
        DateFormat dateIt = DateFormat.getDateInstance(DateFormat.FULL, locale);
        DateFormat dateSui = DateFormat.getDateInstance(DateFormat.FULL, localeSuica);
        DateFormat dateIn = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateJap = DateFormat.getDateInstance(DateFormat.FULL, localeJap);
        DateFormat dateHolanda = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Itália: " + dateIt.format(calendar.getTime()));
        System.out.println("Suiça: " + dateSui.format(calendar.getTime()));
        System.out.println("India: " + dateIn.format(calendar.getTime()));
        System.out.println("Japão: " + dateJap.format(calendar.getTime()));

        System.out.println(localeJap.getDisplayCountry(localeIndia));
        System.out.println(localeHolanda.getDisplayCountry(localeIndia));


        System.out.println(localeHolanda.getDisplayLanguage(locale));
        System.out.println(localeHolanda.getDisplayLanguage());
    }
}
