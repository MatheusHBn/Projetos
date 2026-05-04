package Qstring.test;

public class StringTest01 {
    static void main() {
        String nome = "Matheus";
        String nome2 = "Matheus";
        nome.concat("Henrique"); // msm coisa que -> nome += "Henrique"
        System.out.println(nome == nome2);
        String nome3 = new String("Matheus");
        System.out.println(nome2 == nome3.intern());
    }
}
