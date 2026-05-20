package ZZAclassesinternas.test;

class Animal{
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
