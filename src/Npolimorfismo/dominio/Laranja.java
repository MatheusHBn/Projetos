package Npolimorfismo.dominio;

public class Laranja extends Produto{
    private String dataValidade;
    public static final double IMPOSTO_PORCENTAGEM = 0.243;

    public Laranja(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da laranja");
        return this.valor * IMPOSTO_PORCENTAGEM;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
