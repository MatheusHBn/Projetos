package ZZAclassesinternas.test;

public class OuterClassTest01 {
    /*
    O primeiro tipo de Nested class é a Inner class, que é uma classe interna comum, ela pode acessar
    os atributos da classe externa diretamente, como no exemplo abaixo
    Ela pode acessar todos os modificadores, tanto o private, protected, public, etc.
     */
    private String name = "Matheus";
    class Inner{
        public void PrintOuterClassAtribute(){
            System.out.println(name);
        }
}

    static void main() {
        OuterClassTest01 outerClassTest01 = new OuterClassTest01();
        Inner inner = outerClassTest01.new Inner();
        inner.PrintOuterClassAtribute();

    }
}
