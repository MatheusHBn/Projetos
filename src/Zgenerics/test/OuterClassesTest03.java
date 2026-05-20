package Zgenerics.test;



public class OuterClassesTest03 {
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
