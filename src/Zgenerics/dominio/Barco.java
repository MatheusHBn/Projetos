package Zgenerics.dominio;

public class Barco {
    private String nome;

    public Barco(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome;
    }

    public String getNome() {
        return nome;
    }
}
