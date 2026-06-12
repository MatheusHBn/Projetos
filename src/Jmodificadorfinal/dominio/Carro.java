package Jmodificadorfinal.dominio;

public class Carro {
    /*
    Modificador final, ele é bem simples, ele é um modificador que deixa uma variável constante,
    ou seja, que o valor não se altera, útil em várias situações onde a variável precisa ser padrão
    e imutável, e sempre escreva uma constante (final) em maíusculo
     */
    protected String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public final void imprime(){
        System.out.println(VELOCIDADE_LIMITE);
    }
}
