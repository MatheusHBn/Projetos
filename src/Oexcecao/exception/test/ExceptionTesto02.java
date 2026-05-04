package Oexcecao.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTesto02 {
    static void main() throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean iscriado = file.createNewFile();
            System.out.println("Arquivo Criado " + iscriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}