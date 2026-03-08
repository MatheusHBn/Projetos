package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Estudante;
import Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    static void main() {
        Estudante estudante1 = new Estudante();
        Estudante estudante41 = new Estudante();

        estudante41.nome = "Renato";
        estudante41.idade = 23;
        estudante41.sexo = 'M';

        estudante1.nome = "Fernanda";
        estudante1.idade = 47;
        estudante1.sexo = 'F';

        estudante1.Imprime();
        estudante41.Imprime();
    }
}
