package Pwrapper.test;

public class WrapperTest01 {
    static void main() {
        /*
        Wrappers, são os tipos primitivos, mas em objetos, então sempre que ver um tipo primitivo em letra
        maiúscula, é um objeto, e a mesma escrita (com exceção de int, que vira Integer, e char, que vira
        Character)

        A diferença dos tipos primitivos para Wrappers é:
        1 - Collections: em collections, não pode usar tipos primitivos para fazer uma lista, queue, etc.
        2 - Métodos: como são objetos, os Wrappers tem metodos bem úteis, como: .parseInt(); .doubleValue(); etc.
        3 - Permite valor núlo: nos tipos primitivos, não pode: int idade = null; já nos Wrappers pode: Integer idade = null;
         */
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Long longW = 10L;
        Integer intW = 1; // autoboxing
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        Integer intW3 = Integer.parseInt("5");
        Boolean verdade = Boolean.parseBoolean("true");
        System.out.println(verdade);
        
    }
}
