package Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int VALOR;
    private String nomeJuridico;

    TipoCliente(int VALOR, String nomeJuridico) {
        this.VALOR = VALOR;
        this.nomeJuridico = nomeJuridico;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeJuridico() {
        return nomeJuridico;
    }
}
