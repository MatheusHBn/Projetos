package Bintroducaometodos.dominio;

public class Pessoa {

    /*
    Getters e Setters, são dois métodos onde você pode resgatar e definir as variáveis, e depois, conseguir fazer isso
    com até mesmo modificadores privados(muito importante por questão de segurança)
     */

    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade invalida");
            return;
        }
        this.idade = idade;

    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return this.idade;
    }

}
