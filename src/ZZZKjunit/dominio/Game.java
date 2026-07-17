package ZZZKjunit.dominio;

import java.util.Objects;

public record Game(String name, int value) {
    public Game {
        Objects.requireNonNull(name);
    }
}
