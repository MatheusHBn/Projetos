package ZZEstreams.dominio;

import Ycolecoes.dominio.Perifericos;

import java.util.Objects;

public class Jogo {
    private String name;
    private double price;
    private Categoria categoria;

    public Jogo(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Jogo(String name, double price, Categoria categoria) {
        this(name, price);
        this.categoria = categoria;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public Categoria getCategoria() {

        return categoria;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categoria=" + categoria +
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
