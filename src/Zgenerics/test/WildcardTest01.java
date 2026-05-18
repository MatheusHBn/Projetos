package Zgenerics.test;

abstract class Animal{
   public abstract void consulta();
}

class Gato extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consulta em andamento do gato");
    }
}

class Papagaio extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consulta em andamento do papagaio");
    }
}

public class WildcardTest01 {
    static void main() {
        Gato[] gatos = {new Gato(), new Gato()};
        Papagaio[] papagaios = {new Papagaio(), new Papagaio()};
        mostraConsulta(gatos);
        mostraConsulta(papagaios);
        // corrigindo pra n dar erro, e comentar da linha 23 até a 26
        Animal[] animals = {new Gato(), new Papagaio()};
        mostraConsulta(animals);
    }
    private static void mostraConsulta(Animal[] animais){
        for (Animal animals : animais){
            animals.consulta();
        }
//        animais[1] = new Gato(); , descomentar essa dps de arrumar ali em cima
    }
}
