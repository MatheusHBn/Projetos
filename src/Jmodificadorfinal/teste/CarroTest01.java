package Jmodificadorfinal.teste;

import Jmodificadorfinal.dominio.Carro;
import Jmodificadorfinal.dominio.Comprador;
import Jmodificadorfinal.dominio.Porshe;

public class CarroTest01 {
    static void main() {
        Carro carro = new Carro();
        Porshe porshe = new Porshe();


        System.out.println(carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Matheus");

        System.out.println(carro.COMPRADOR);
        porshe.setNome("911");
        System.out.println(porshe);
    }
}
