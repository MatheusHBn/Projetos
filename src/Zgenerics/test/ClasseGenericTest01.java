package Zgenerics.test;

import Zgenerics.dominio.Carro;
import Zgenerics.service.CarroRentavelService;

public class ClasseGenericTest01 {
    /*
    Classe Genérica, mesma coisa do metodo generico, é uma classe que recebe um tipo como parâmetro
    "Tá, mas pra que serve?" imagine que você vai criar uma classe de celulares, sem a classe generica, você iria ter
    que criar metodos para celulares de Samsung, Xiomi, Iphone, etc. Mas com a classe generica, você cria um metodo só

     */
    static void main() {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscaCarroDisponiveis();
        System.out.println("Usando o carro por 1 mês....");
        carroRentavelService.retornaCarroAlugado(carro);

    }
}
