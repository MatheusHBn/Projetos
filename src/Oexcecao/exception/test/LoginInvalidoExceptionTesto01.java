package Oexcecao.exception.test;

import Oexcecao.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTesto01 {
    static void main() {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String nomeDB = "Matheus";
        String senhaDB = "5";
        System.out.println("Usuario");
        String nomeDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if(!nomeDB.equals(nomeDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuario ou senha invalidos");
        }
        System.out.println("Usuario logado com sucesso");
    }
}
