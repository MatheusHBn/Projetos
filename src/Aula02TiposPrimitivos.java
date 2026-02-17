public class Aula02TiposPrimitivos {
    static void main() {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 3800;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0031';

        System.out.println("A idade é " + idade + " anos");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);
        // aprendi basicamente sobre os tipos de variáveis que o Java tem e como usa-las corretamente
    }
}
