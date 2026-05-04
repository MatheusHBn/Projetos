package Oexcecao.RunTime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    static void main() {
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
