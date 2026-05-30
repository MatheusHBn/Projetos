package Aintroducaoclasse.test;

import Aintroducaoclasse.dominio.ExercicioCarro;

public class CarroTest {
    static void main() {
        /*
        para inicializar um objeto, você pega o arquivo que você fez anteriormente, da um nome, e inicialia com new
        e depois basta você colocar variavel.nome, variavel.idade, e adicionar ou mudar as características (se tiver com
        o modificador de acesso public, mas jaja a gente chega la)
         */


        ExercicioCarro carro = new ExercicioCarro();
        ExercicioCarro carro1 = new ExercicioCarro();

        carro.nome = "Tesla";
        carro.modelo = "CyberTruck";
        carro.ano = 2021;

        carro1.nome = "Porshe";
        carro1.modelo = "911";
        carro1.ano = 2019;

        System.out.println("Nome: "+carro.nome+"; Modelo: "+carro.modelo+"; Ano: "+carro.ano);
        System.out.println("Nome: "+carro1.nome+"; Modelo: "+carro1.modelo+"; Ano: "+carro1.ano);
    }
}
