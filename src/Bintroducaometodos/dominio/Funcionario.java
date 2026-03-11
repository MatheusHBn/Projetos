package Bintroducaometodos.dominio;

public class Funcionario {
    // criar um classe funcionario com nome, idade e salario(deve ter 3 salarios), e criar metodos para imprimir os dados
    // e tirar a media dos salarios e imprimir a media final

    public String nome;
    public int idade;

    public void Dados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public void MediaSalario(double... salario) {
        double soma = 0;
        double media = 0;
        int numSalario01 = 0;
        int numSalario02 = 1;
        for (double salarios : salario) {
            soma += salarios;
            numSalario01 += numSalario02;
            System.out.print("Salário " + numSalario01 + " : " + salarios + " | ");
        }

        double soma01 = 0;
        double media01 = 0;
        for (double sal : salario) {
            if (salario == null){
               return;
            }
            soma01 += sal;
            media01 = soma01 / salario.length;
        }
        System.out.print("\nMédia dos Salários: " + media01);
    }
}
