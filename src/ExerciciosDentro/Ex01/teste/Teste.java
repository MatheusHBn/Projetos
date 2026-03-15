package ExerciciosDentro.Ex01.teste;

import ExerciciosDentro.Ex01.dominio.Estudante;
import ExerciciosDentro.Ex01.dominio.Local;
import ExerciciosDentro.Ex01.dominio.Professor;
import ExerciciosDentro.Ex01.dominio.Seminario;

public class Teste {
    static void main() {
        Estudante estudante1 = new Estudante("Matheus", 20);
        Estudante estudante2 = new Estudante("Ismael", 20);
        Estudante estudante3 = new Estudante("Lucas", 20);
        Estudante estudante4 = new Estudante("Luis", 23);
        Professor professor = new Professor("Raul", "Matemáica");
        Professor professor1 = new Professor("Dalk", "Física");
        Seminario seminario = new Seminario("Integrais");
        Seminario seminario1 = new Seminario("Derivadas");
        Local local = new Local("Escola");
        Local local1 = new Local("Faculdade");

        Estudante[] estudantes = {estudante1, estudante2};
        Estudante[] estudantes1 = {estudante3, estudante4};
        Seminario[] seminarios = {seminario, seminario1};

        estudante1.setSeminario(seminario);
        estudante2.setSeminario(seminario);
        estudante3.setSeminario(seminario1);
        estudante4.setSeminario(seminario1);

        seminario1.setEstudante(estudantes);
        seminario.setEstudante(estudantes1);
        seminario.setLocal(local);
        seminario1.setLocal(local1);

        professor.setSeminarios(seminarios);
        professor1.setSeminarios(seminarios);

        estudante1.imprime();
        estudante2.imprime();
        estudante3.imprime();
        estudante4.imprime();
        System.out.println("--------------");
        seminario.imprime();
        System.out.println("--------------");
        seminario1.imprime();
        System.out.println("--------------");
        professor.imprime();
        professor1.imprime();
    }
}
