package ExerciciosDentro.Ex01.dominio;

public class Local {
    private String endereco;
    private Seminario seminario;

    public Local(String endereco){
        this.endereco = endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

}
