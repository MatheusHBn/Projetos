package ZZEstreams.dominio;

import Ycolecoes.dominio.Perifericos;

import java.util.Objects;

public class Jogo {
    private String name;
    private double price;

    public Jogo(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jogo jogo = (Jogo) o;
        return Objects.equals(name, jogo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
