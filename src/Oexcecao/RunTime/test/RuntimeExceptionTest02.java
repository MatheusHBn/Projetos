package Oexcecao.RunTime.test;

public class RuntimeExceptionTest02 {
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
