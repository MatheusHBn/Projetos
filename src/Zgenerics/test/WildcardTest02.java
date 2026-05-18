package Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    static void main() {
        List<Gato> gatos = List.of(new Gato() , new Gato());
        List<Papagaio> papagaios = List.of(new Papagaio(), new Papagaio());
        mostraConsulta(gatos);
        mostraConsulta(papagaios);
        List<Animal> animals = new ArrayList<>();
        mostraConsulta(animals);
        mostraConsulta(gatos);

    }
        // type erasure de novo
    private static void mostraConsulta(List<? extends Animal> animals){
        for (Animal animal: animals){
            animal.consulta();
        }
    }

    private static void mostraAnimal(List<? super Animal> animals){
        Animal animal = new Gato();
        Animal animal1 = new Papagaio();
        animals.add(new Papagaio());
        animals.add(new Gato());
    }
}
