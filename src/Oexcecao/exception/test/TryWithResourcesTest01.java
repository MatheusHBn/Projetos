package Oexcecao.exception.test;

import Oexcecao.exception.dominio.Leitor1;
import Oexcecao.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    /*
    Aqui tem uma coisa nova, que é o Finally, o finally executa independente do que ocorreu no código
    se a exceção for pega ou não, ele vai executar, geralmente ele serve para fechar arquivos, conexões com
    o DB, etc
    Imporante lembrar que no finally tambem pode ter outro try e catch, que nem no exemplo abaixo
     */
    static void main() {
        lerArquivo();
    }
    public static void lerArquivo(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


    public static void lerArquvio2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
