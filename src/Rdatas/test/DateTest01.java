package Rdatas.test;

import java.util.Date;

public class DateTest01 {
    /*
    Date, não preciso falar muito né?

    Maass ele funciona um pouco diferente, ele envia a data em um long muito extenso, que são, os milisegundos
    desde o dia 1/1/1970, e para adicionar ou subtrair, precisa fazer isso usando milisegundos
    (sim, você não leu errado, MILIsegundos)
    E ele também é da API antiga do Java, ou seja, só use em casos específicos
     */
    static void main() {
        Date date = new Date(1778016433763L);
        date.setTime(date.getTime() + 3600000);
        System.out.println(date);
    }
}
