package ZZAclassesinternas.test;

public class OuterClassesTest02 {

    private String name = "MatheusH";

    void print(){
        String lastName = "Nascimento"; /* ela é final, n pode modificar */
    /* Só posso usar final o abstract aq */
        class LocalClass{
            public void printLocal(){
                System.out.println(name + " " + lastName);
            }
        }
        LocalClass localClass =new LocalClass();
        localClass.printLocal();
    }
    static void main() {
        OuterClassesTest02 outerClassesTest02 = new OuterClassesTest02();;
        outerClassesTest02.print();
    }
}
