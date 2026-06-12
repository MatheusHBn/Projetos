package Sformatacao.test;

import java.util.Locale;

public class LocalTest02 {
    /*
    Essa parte de formatação, é literalmente o nome, é pra falar sobre a formatação de números, moeda
    data, data no computador, etc.
     */
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
