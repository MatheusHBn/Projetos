package Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    static void main() {
        String mascara = "'Amsterdam' dd 'de' MMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(mascara);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("Amsterdam 15 de Março de 2023"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
