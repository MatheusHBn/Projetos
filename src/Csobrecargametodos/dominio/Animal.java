package Csobrecargametodos.dominio;

public class Animal {
    /*
    Sobrecarga de métodos, é quando você tem dois métodos iguais, mas um algum parâmetro ou
    tipo de característica diferente. O Java escolhe qual método usar com base nos parâmentros
    passados.

     */


    private String raca;
    private String nome;
    private int idade;
    private boolean vacinado;

    public void init(String nome, String raca, int idade){
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }

    public void init(String nome, String raca, int idade, boolean vacinado) {
        this.init(raca, nome, idade);
        this.vacinado = vacinado;
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

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.raca);
        System.out.println(this.vacinado);
    }
}
