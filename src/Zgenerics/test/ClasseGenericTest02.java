package Zgenerics.test;

import Zgenerics.dominio.Barco;
import Zgenerics.service.BarcoRentavelService;


public class ClasseGenericTest02 {
    static void main() {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscaBarcoDisponiveis();
        System.out.println("Usando o Barco por 1 mês......");
        barcoRentavelService.retornaBarcoAlugado(barco);
    }
}
