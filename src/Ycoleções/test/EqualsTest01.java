package Ycoleções.test;

import Ycoleções.dominio.Celular;

public class EqualsTest01 {
    static void main() {
        Celular celular1 = new Celular("945AF", "Samsung");
        Celular celular2 = new Celular("945AF", "Samsung");

        System.out.println(celular1.equals(celular2));
    }
}
