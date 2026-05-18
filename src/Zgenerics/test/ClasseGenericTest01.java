package Zgenerics.test;

import Zgenerics.dominio.Carro;
import Zgenerics.service.CarroRentavelService;

public class ClasseGenericTest01 {
    static void main() {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscaCarroDisponiveis();
        System.out.println("Usando o carro por 1 mês....");
        carroRentavelService.retornaCarroAlugado(carro);

    }
}
