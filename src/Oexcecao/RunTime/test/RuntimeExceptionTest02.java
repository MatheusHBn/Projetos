package Oexcecao.RunTime.test;

public class RuntimeExceptionTest02 {
    /*
    algo interessante, você não precisa necessariamente de um try catch se a exceção for de fácil tratamento,
    e for um código simples como, por exemplo: a divisão por 0, onde basta eu colocar o "throws" no metodo, e a
    exceção que irá ser lançada
     */
    static void main() {
        System.out.println((divisao(1,0)));
    }
    private static int divisao(int a, int b) throws IllegalArgumentException{
        if (b == 0) {
            throw new IllegalArgumentException("Argumento não permitidoo");
        }
        return a/b;
    }
}
