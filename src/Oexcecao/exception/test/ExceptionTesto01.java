package Oexcecao.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTesto01 {
    static void main() {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean iscriado = file.createNewFile();
            System.out.println("Arquivo Criado " + iscriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}