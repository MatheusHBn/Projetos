package Zgenerics.service;

import Zgenerics.dominio.Barco;
import Zgenerics.dominio.Carro;

import java.util.List;

public class RentalService <T> {
    private List<T> objetosDisponveis;

    public RentalService(List<T> objetosDisponveis){
        this.objetosDisponveis = objetosDisponveis;
    }

    public T buscaObjetosDisponiveis(){
        System.out.println("Buscando objetos disponiveis");
        T t = objetosDisponveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Obejtos disponiveis para alugar: ");
        System.out.println(objetosDisponveis);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo carro " + t);
        objetosDisponveis.add(t);
        System.out.println("Objetos disponiveis para alugar: ");
        System.out.println(objetosDisponveis);
    }

    public void retornarObjetoAlugado(Barco barco) {
    }
}

