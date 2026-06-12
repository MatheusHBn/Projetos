package Oexcecao.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTesto01 {
    /*
    Try e catch, é justamente o que iremos usar para tratar as exceções.
    Try, é o lugar aonde vamos colocar o código que pode gerar alguma exception
    Catch, é o lugar aonde vamos capturar e tratar a exceção
    OBS.: o Catch em 99.5% das vezes deverá ter o tratamento das exceções, pois se não, você não saberá
    aonde o código deu erro, e não conseguirá arrumar, e pode deixar o cliente confuso
     */
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