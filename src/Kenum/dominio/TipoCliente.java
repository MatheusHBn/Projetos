package Kenum.dominio;

public enum TipoCliente {
    /*
    Enumeração, é um conjunto no Java aonde você guarda as constantes ( final), então tudo que você escrever
    aqui é uma constante. Você pode usar várias coisa aqui, como for, if, switch e até mesmo métodos
     */
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int VALOR;
    private String nomeJuridico;

    TipoCliente(int VALOR, String nomeJuridico) {
        this.VALOR = VALOR;
        this.nomeJuridico = nomeJuridico;
    }

      public static TipoCliente NomeJuridico(String nomeJuridico){
        for (TipoCliente tipoCliente : values()){
            if (tipoCliente.getNomeJuridico().equals(nomeJuridico)){
                return tipoCliente;
            }
        }
        return null;
     }

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeJuridico() {
        return nomeJuridico;
    }
}
