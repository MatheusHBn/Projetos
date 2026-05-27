package ZZClambdas.dominio;

public class Processadores {
    private String name;
    private String model;

    public Processadores(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Processadores{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }


}
