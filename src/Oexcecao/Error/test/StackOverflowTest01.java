package Oexcecao.Error.test;

public class StackOverflowTest01 {
    static void main() {
        recursivo();
    }
    public static void recursivo(){
        recursivo();
    }
}
