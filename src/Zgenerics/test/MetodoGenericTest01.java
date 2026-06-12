package Zgenerics.test;

import Zgenerics.dominio.Carro;

import java.util.List;

public class MetodoGenericTest01 {
    /*
    Métodos Genéricos, você vai afirmar que vai passar T tipo de alguma coisa (pode ser Carro, Senha, Barco, etc.)
    é basicamente você informar que o metodo possui o seu próprio parâmetro de tipo
     */
    static void main() {
        System.out.println(CriaArrayComObjeto(new Carro("Porshe")));
    }

    private static <T> List<T> CriaArrayComObjeto(T t){
        return List.of(t);
    }
}
