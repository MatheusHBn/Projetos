package ZZHpadroesdeprojeto.test;

import ZZHpadroesdeprojeto.dominio.Aircraft;

public class AircraftTest01 {
    /*
    Outro padrão de projeto interresante é o Singleton, ele garante que exista somente uma instância de uma classe.
    Ele é usado quando você quer somente um objeto, ou quando não pode haver duplicação (como ali embaixo, onde tem dois
    bookSeat no 1A). Para impedir isso é simples: Deixe o construtor privado, para evitar o new Aircraft();

    E aqui veremos o tipo Eager Initialization, onde a própria classe cria sua única instância, onde o objeto:
    1- Não é acessado diretamente;
    2- Nunca muda;
    3- Cria o objeto apenas uma vez.
    Quem for usar a classe faz (exemplo): Aircraft ac = Aircraft.getInstance(); dessa forma, sempre recebe o mesmo objeto

    Tem o nome Eager porque Eager significa "Criar imediatamente", ou seja, quando a classe carregar, a primeira coisa
    que vai acontecer é o objeto ser criado
     */
    static void main() {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        Aircraft aircraft = new Aircraft("Boing");
        System.out.println(aircraft.bookSeat(seat));
    }
}
