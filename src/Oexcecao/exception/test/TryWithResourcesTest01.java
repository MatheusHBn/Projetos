package Oexcecao.exception.test;

import Oexcecao.exception.dominio.Leitor1;
import Oexcecao.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    static void main() {
        lerArquivo();
    }
    public static void lerArquivo(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e){

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
