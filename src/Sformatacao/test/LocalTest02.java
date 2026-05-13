package Sformatacao.test;

import java.util.Locale;

public class LocalTest02 {
    static void main() {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }
        System.out.println();
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }
    }
}
