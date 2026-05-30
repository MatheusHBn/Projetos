package Dconstrutores.teste;


import Dconstrutores.dominio.Animal;

public class Animal01 {
    static void main() {
        /*
        e como podemos ver, para você conseguir rodar o código, você precisa definir o nome, raça, idade, e se é vacinado
         */

        Animal animal = new Animal("Apollo" , "Mestiço" , 8 , "Sim");
        animal.imprime();
    }
}
