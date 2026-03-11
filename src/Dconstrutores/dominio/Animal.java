package Dconstrutores.dominio;

public class Animal {
    private String raca;
    private String nome;
    private int idade;
    private String vacinado;

    public Animal(String nome , String raca, int idade){
        this();
        this.nome = nome;
        this.raca = raca;
        this.idade = 7;
    }

    public Animal(String nome , String raca, int idade, String vacinado){
        this(nome, raca, idade);
        this.vacinado = vacinado;
    }

    public Animal(){
        System.out.println("Dentro do 2o");
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
        System.out.println(this.vacinado);
    }
}
