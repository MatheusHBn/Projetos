package Aintroducaoclasse.test;

import Aintroducaoclasse.dominio.ExercicioCarro;

public class CarroTest {
    static void main() {
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
