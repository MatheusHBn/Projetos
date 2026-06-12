package Oexcecao.exception.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable {
    /*
     Uma coisa interessante é, você pode fazer os métodos jogarem alguma exception, caso ela aconteça,
     basta no final do metodo, você usar o "throws" para indicar que esse metodo pode causar essa exception
     */
    @Override
    public void close() throws IOException{
        System.out.println("Fechando leitor 1");
    }
}
