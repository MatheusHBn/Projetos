package ZZAclassesinternas.test;

public class OuterClassTest01 {


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
