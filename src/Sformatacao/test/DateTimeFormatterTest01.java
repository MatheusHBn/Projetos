package Sformatacao.test;

import Rdatas.test.LocalDateTest01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    /*
    DateTimeFormatter, ensina como formatar datas de várias maneiras (que o Java tem), e como pegar uma data e transformá-la
    em objeto (de String para objeto), ele também funciona com LocalDateTime, também é possível definir um padrão de data formatada
    pelo DateTimeFormatter.ofPattern();

    Importante lembrar que quando você for colocar a formatação de dia/mês/ano, coloque o mês sempre em maiúsculo(M), se não
    o Java confunde com minutos. E quantos mais "d's" "M's" e "y's" você colocar, mais extenso será o dia/mês/ano (e sim,
    tem um limite do tanto que você pode colocar)

     */
    static void main() {
        LocalDate date = LocalDate.now();

        String s1 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String s2 = date.format(DateTimeFormatter.BASIC_ISO_DATE);

        System.out.println(s1);
        System.out.println(s2);

        LocalDate parse = LocalDate.parse("2026-06-09", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse);

        LocalDateTime now = LocalDateTime.now();
        String s3 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s3);

        LocalDateTime parse1 = LocalDateTime.parse("2026-06-09T18:12:05.9472165");
        System.out.println(parse1);

        DateTimeFormatter dateTimeFormatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatterEUA = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String formatBR = LocalDateTime.now().format(dateTimeFormatterEUA);
        String formatEUA = LocalDateTime.now().format(dateTimeFormatterBR);

        System.out.println(formatBR);

        LocalDate parse2 = LocalDate.parse("28/02/2026", dateTimeFormatterBR);
        System.out.println(parse2);

        DateTimeFormatter formatterAL = DateTimeFormatter.ofPattern("yyyy.MM.dd", Locale.FRANCE);
        String formatAL = LocalDate.now().format(formatterAL);
        System.out.println(formatAL);
        LocalDate parse3 = LocalDate.parse("2026.06.09", formatterAL);
        System.out.println(parse3);

    }
}
