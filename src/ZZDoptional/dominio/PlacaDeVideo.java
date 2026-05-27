package ZZDoptional.dominio;

public class PlacaDeVideo {
    private Integer id;
    private String name;
    private String model;

    public PlacaDeVideo(String name, Integer id, String model) {
        this.name = name;
        this.id = id;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "placaDeVideo{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", model=" + model +
                '}';
    }
}
