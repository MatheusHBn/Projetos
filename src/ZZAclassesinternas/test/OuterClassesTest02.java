package ZZAclassesinternas.test;

public class OuterClassesTest02 {
    /*
    Outro tipo de Nested Class é a Local, que é uma classe criada num metodo, e fora do metodo essa
    classe não existe
     */

    private String name = "MatheusH";

    void print(){
        String lastName = "Nascimento"; /* ela é final, não pode modificar */
    /* Só posso usar final e abstract aq */
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
