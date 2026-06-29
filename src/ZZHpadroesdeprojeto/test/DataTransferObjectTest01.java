package ZZHpadroesdeprojeto.test;

import ZZHpadroesdeprojeto.dominio.*;

public class DataTransferObjectTest01 {
    /*
    A última parte de padrões de projetos, é sobre DTO (Data Transfer Object), que é a parte do jeito em que você trans
    porta vários objetos para o main, onde não tem muito segredo, é só criar uma classe, e juntar todos os conhecimentos
    de padrões de projeto que vimos anteriormente(Eager, Lazy, Builder, Factory, etc.) nela.
     */
    static void main() {
        Aircraft aircraft = new Aircraft("Boing 123");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        ReportDto reportDto = ReportDto.ReportDtoBuilder
                .builder()
                .aircraftName("Boing 123")
                .personName("Matheus")
                .country(Country.BRAZIL)
                .currency(currency).build();
        System.out.println(reportDto);
    }
}
