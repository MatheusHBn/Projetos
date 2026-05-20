package Zgenerics.test;

import Zgenerics.dominio.Carro;

import java.util.List;

public class MetodoGenericTest01 {
    static void main() {
        System.out.println(CriaArrayComObjeto(new Carro("Porshe")));
    }

    private static <T> List<T> CriaArrayComObjeto(T t){
        return List.of(t);
    }
}
