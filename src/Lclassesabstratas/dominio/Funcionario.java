package Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    /*
    Classe e modificador Abstract, A classe abstrata é uma classe que não pode ser instanciada diretamente
    ( ou seja, n pode usar o new), ela é utilizada para quando você tem várias classes que podem ter um mesmo
    método, mas esse método executa uma coisa diferente em cada um, por ex: Cachorro, Gato e Pássaro, todos são
    animais, mas cada um faz um som diferente, então você pode usar:

    public abstract void emitirSom();

    e quando voce for usar o método, voce configura ele em cada uma das classes de um jeito diferente.
    Geralmente, a classe abstrata aparece na classe pai, e as filhas implementam o metodo sobrescrevendo eles

    o modificador abstract só pode existir dentro de uma classe abstrata,
    e só deve ser implementado pela classe filha, e não possui as {}, ou seja, não pode ter um método que
    executa alguma coisa, ele está lá só parar servir como um molde
     */
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();

    @Override
    public void imprime() {

    }
}
