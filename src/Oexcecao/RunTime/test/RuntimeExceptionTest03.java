package Oexcecao.RunTime.test;

public class RuntimeExceptionTest03 {
    static void main() {
        abreConexao2();
    }
    private static String abreConexao(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escreve os dados");
            return "conexão aberta";
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso");
        } return null;
     }
    private static void abreConexao2(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escreve os dados");
        }
        finally {
            System.out.println("Fechando recurso");
        }
    }
}
