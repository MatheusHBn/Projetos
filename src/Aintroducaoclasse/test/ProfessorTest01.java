package Aintroducaoclasse.test;

import Aintroducaoclasse.dominio.Professor;

public class ProfessorTest01 {
    static void main() {
        Professor professor = new Professor();
        professor.nome = "Raul";
        professor.idade = 34;
        professor.sexo = 'M';

        System.out.println(professor.nome + " "+ professor.idade + " "+professor.sexo);
    }
}
