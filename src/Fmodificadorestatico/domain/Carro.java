package Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMax;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMax){
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setvelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public String getNome() {
        return nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void impime(){
        System.out.println(nome);
        System.out.println(velocidadeMax);
        System.out.println(velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }
}
