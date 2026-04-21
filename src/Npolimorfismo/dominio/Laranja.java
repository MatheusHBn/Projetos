package Npolimorfismo.dominio;

public class Laranja extends Produto{
    private String dataValidade;
    public static final double IMPOSTO_PORCENTAGEM = 0.243;

    public Laranja(String nome, double valor, String dataValidade) {
        super(nome, valor);
        this.dataValidade = dataValidade;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador");
        return this.valor * IMPOSTO_PORCENTAGEM;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
