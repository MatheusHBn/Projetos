package Oexcecao.RunTime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    static void main() {
        /*
        E a última coisa que veremos sobre exceptions é, num try catch finally, pode ter mais de um catch,
        que serve para quegar mais de uma exceção.
        Mas é redundante, pois pode ser usado o | (or) para pegar mais de uma exceção no mesmo catch
         */
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException  | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e ){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }

        try {
            talvezLanceExcecao();
        } catch (SQLException | IOException e){
            e.printStackTrace();
        }

    }
    private static void talvezLanceExcecao() throws SQLException, FileNotFoundException{

    }
}
