package Zgenerics.test;



public class OuterClassesTest03 {
    /*

    Nested Class, é uma classe dentro de outra classe (interna e externa), só faz sentido usar quando a classe interna
    só faz sentido se a classe externa existir, exemplo: Pedido e itemPedido, itemPedido só faz sentido se Pedido existir
     */
    private String name = "MatheusH";
    static class Nested{
        private String lastName = "Nascimento";
        void print(){
            System.out.println(new OuterClassesTest03().name+ " " + lastName);
        }
    }
    static void main() {
        Nested nested = new Nested();
        nested.print();
    }
}
