package Qstring.test;

public class StringBuilderTest01 {
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
