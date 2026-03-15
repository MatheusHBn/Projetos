package Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita seu nome");
        String nome = sc.nextLine();
        System.out.println("Digita sua idade");
        int idade = sc.nextInt();
        System.out.println("Digite seu sexo(M ou F)");
        char sexo = sc.next().charAt(0);
        System.out.println("-------------");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
    }
}
