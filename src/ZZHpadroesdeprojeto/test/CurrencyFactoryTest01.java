package ZZHpadroesdeprojeto.test;

import ZZHpadroesdeprojeto.dominio.Country;
import ZZHpadroesdeprojeto.dominio.Currency;
import ZZHpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    /*
    Outro padrão de projeto bem utilizado é o Factory, ele decide qual objeto criar. A ideia dele é criar uma classe
    responsável por criar objetos, e é isso, não tem muito mais o que explicar
     */
    static void main() {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency);
    }
}
