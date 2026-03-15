package ExerciciosDentro;

import java.util.Scanner;

public class LeituraDoTeclado {
    static void main() {
        // Basicamente era pra fazer um programa para responder sim ou não em alguma condição específica

        Scanner sc = new Scanner(System.in);
        System.out.println("Eu sou um programa para responder perguntas");

        for (int i = 0; i < 10; i++) {
            System.out.println("Faça uma pergunta e eu responderei sim ou não");
            String pergunta = sc.nextLine();
            if (pergunta.charAt(0) == 'A') {
                System.out.println("Não");
            } else if (pergunta.charAt(0) == 'E') {
                System.out.println("Não");
            } else if (pergunta.charAt(0) == 'I') {
                System.out.println("Não");
            } else if (pergunta.charAt(0) == 'O') {
                System.out.println("Não");
            } else if (pergunta.charAt(0) == 'U') {
                System.out.println("Não");
            }
            else if (pergunta.charAt(0) == 'a') {
                System.out.println("Não");
            } else if (pergunta.charAt(0) == 'e') {
                System.out.println("Não");
            } else if (pergunta.charAt(0) == 'i') {
                System.out.println("Não");
            } else if (pergunta.charAt(0) == 'o') {
                System.out.println("Não");
            } else if (pergunta.charAt(0) == 'u') {
                System.out.println("Não");
            }
            else {
                System.out.println("Sim");
            }
            i++;
        }
    }
}
