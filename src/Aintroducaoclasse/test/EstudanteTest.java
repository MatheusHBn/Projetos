package Aintroducaoclasse.test;

import Aintroducaoclasse.dominio.Estudante;

public class EstudanteTest {
    static void main() {
        Estudante estudante = new Estudante();
        estudante.nome = "Miguel";
        estudante.idade = 23;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
