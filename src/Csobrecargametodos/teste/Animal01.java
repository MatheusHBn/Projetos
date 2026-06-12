package Csobrecargametodos.teste;

import Csobrecargametodos.dominio.Animal;

public class Animal01 {
    static void main() {
        /*
        Aqui, por exemplo, foi passado três parâmetros, então o Java vai escolher o método com somente
        tres parametros, e note que você pode adicionar algum atributo usando o set
        (dependendo da situação e contexto)
         */


        Animal animal = new Animal();
        animal.init("Apollo" , "Mestiço" , 6);
        animal.setVacinado(true);
        animal.imprime();
    }
}
