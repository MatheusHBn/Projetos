package Npolimorfismo.servico;

import Npolimorfismo.repositorio.Repositorio;

public class RepositorioBD implements Repositorio {
    @Override
    public void salvar(){
        System.out.println("Salvando em um banco de dados");
    }
}
