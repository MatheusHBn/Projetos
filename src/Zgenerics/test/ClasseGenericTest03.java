package Zgenerics.test;

import Zgenerics.dominio.Barco;
import Zgenerics.dominio.Carro;
import Zgenerics.service.RentalService;
import java.util.ArrayList;
import java.util.List;


public class ClasseGenericTest03 {
    static void main() {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Maverick"), new Carro("Toyota")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Caiaque"), new Barco("Iate")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscaObjetosDisponiveis();
        System.out.println("Usando o Barco por 1 mês......");
        rentalService.retornarObjetoAlugado(carro);
        System.out.println("--------------------------");

        RentalService<Barco> rentalService1 = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalService1.buscaObjetosDisponiveis();
        System.out.println("Usando o Barco por 1 mês......");
        rentalService.retornarObjetoAlugado(barco);
    }
}
