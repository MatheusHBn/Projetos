package Csobrecargametodos.dominio;

public class Animal {
    private String raca;
    private String nome;
    private int idade;

    public void init(String nome, String raca, int idade){
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.raca);
    }
}
