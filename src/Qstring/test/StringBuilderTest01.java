package Qstring.test;

public class StringBuilderTest01 {
    /*
    StringBuilder, antes de falarmos dele, precisamos saber o que é uma "String" para podermos diferenciar depois

    Uma "String" é um objeto que representa palavras com o "", ela é imutável, ou seja, após criada,
    ela não pode ser alterada, por mais que pareça que ela foi modificada, o Java só cria outro objeto,
    e tem alguns problemas nisso, como em "loops".

    Já o StringBuilder, ele é mutável, então quando você for itera ele, ele não cria outros objetos desnecessários,
    e ele tem algumas classes utilitárias que não tem na "string" padrão, como .reverse(); .apprend(); etc.
     */
    static void main() {
        String nome = "Matheus Henrique";
        nome.concat("Nascimento");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Mathheus ");
        sb.append("Banda");
        sb.reverse();
        sb.reverse();
        sb.delete(4,6);
        System.out.println(sb);
    }
}
