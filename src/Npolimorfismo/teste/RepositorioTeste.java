package Npolimorfismo.teste;

import Npolimorfismo.repositorio.Repositorio;
import Npolimorfismo.servico.RepositorioArquivo;
import Npolimorfismo.servico.RepositorioBD;

public class RepositorioTeste {
    static void main() {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
