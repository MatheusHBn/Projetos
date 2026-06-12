package Oexcecao.RunTime.test;

public class RuntimeExceptionTest03 {
    /*
    Duas coisas interessantes, a primeira é que o try catch finally pode ser usado dentro de metodos, para
    poupar código no código principal
    E você pode usar um try finally ao inves do try catch (a exceção continua a ser lançada no try finally)
    e em algumas situações, é preferível usar o try finally ao invés do try catch, seja para fechar a conexão
    com o DB, fechar um arquivo, etc.
    "E porque não usar o catch?" porque as vezes quem chamou o metodo é quem deve decidir o que fazer com o erro
     */
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
