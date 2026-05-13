package Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    static void main() {

        Locale locale1 = Locale.CANADA;
        Locale locale2 = Locale.KOREA;
        Locale locale3 = Locale.UK;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(locale1);
        nfa[2] = NumberFormat.getCurrencyInstance(locale2);
        nfa[3] = NumberFormat.getCurrencyInstance(locale3);

        double valor = 10_000.2199;
        for (NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.format(valor));
            System.out.println(numberFormat.getMaximumFractionDigits());
        }
        String valor2 = "10,030.302";
        try {
            System.out.println(nfa[1].parse(valor2));
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}
