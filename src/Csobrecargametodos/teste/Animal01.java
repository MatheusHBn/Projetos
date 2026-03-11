package Csobrecargametodos.teste;

import Csobrecargametodos.dominio.Animal;

public class Animal01 {
    static void main() {
        Animal animal = new Animal();
        animal.init("Apollo" , "Mestiço" , 6);
        animal.imprime();
    }
}
