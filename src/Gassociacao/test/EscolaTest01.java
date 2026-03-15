package Gassociacao.test;

import Gassociacao.dominio.Escola;
import Gassociacao.dominio.Professor;

public class EscolaTest01 {
    static void main() {
        Professor professor = new Professor("Raul");
        Professor professor1 = new Professor("Dalke");
        Professor[] professores = {professor, professor1};
        Escola escola = new Escola("Senac", professores);

        escola.imprime();
    }
}
