public class Exercicio02 {
    static void main() {
        // dado determinado salario, qual o valor que eu tenho que pagar de imposto( dados de 2020, taxas dos paises baixos)
        // números em euros
        /*
        int salary = 45000;
        boolean tax1 = salary < 34712;
        boolean tax2 = salary > 34713 && salary < 68507;
        String DefinitiveTax;
        // Jeito 1
        if (tax1) {
            System.out.println("Seu imposto é de 9.70%");
        } else if (tax2) {
            System.out.println("Seu imposto é de 37.35%");
        } else {
            System.out.println("Seu imposto é de 49.50%");
        }
        // Jeito 2
        if (tax1) {
                DefinitiveTax = "Imposto de 9,70%";
        } else if (tax2) {
            DefinitiveTax = "Imposto de 37.35%";
        } else {
                DefinitiveTax = "Imposto de 49.50%";
        }
            System.out.println(DefinitiveTax);

         */

        // Agora calculando o imposto

        double salaryYear = 2000;
        double Tax1 = 9.70/100;
        double Tax2 = 37.35/100;
        double Tax3 = 49.50/100;
        double ValueTax;

        if (salaryYear <= 36712) {
            ValueTax = salaryYear*Tax1;
        } else if (salaryYear > 36713 && salaryYear < 68507) {
            ValueTax = salaryYear * Tax2;
        } else {
            ValueTax = salaryYear * Tax3;
        }
        System.out.println(ValueTax);

    }
}