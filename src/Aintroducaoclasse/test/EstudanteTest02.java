package Aintroducaoclasse.test;

import Aintroducaoclasse.dominio.Estudante;

public class EstudanteTest02 {
    static void main() {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Lucas";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);

    }
}
