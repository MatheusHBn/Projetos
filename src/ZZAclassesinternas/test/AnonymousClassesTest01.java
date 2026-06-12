package ZZAclassesinternas.test;

class Animal{
    /*
    E a última é o Anonymous Class, ela é uma classe que não tem nome, é declarada e instanciada no mesmo
    lugar e é usada para fazer alguma coisa apenas uma vez
    É chamada de classe anônima justamente por não ter o "Class x", e nesse exemplo abaixo, é usada apenas
    para mudar alguma ação específica, e não precisar criar uma arquivo novo ou nada do tipo
     */
    public void walk(){
        System.out.println("Animal walking");
    }
}

public class AnonymousClassesTest01 {
    static void main() {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the beach");
            }
        };
        animal.walk();
    }
}
