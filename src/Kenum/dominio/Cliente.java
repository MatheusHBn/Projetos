package Kenum.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString(){
        return "Cliente: "+ this.nome + "\n Tipo do Cliente: "+ this.tipoCliente.getNomeJuridico()  + "Tipo do cliente: " + this.tipoCliente.getVALOR() +
                "\n Tipo do Pagamento: " + this.tipoPagamento +"\n---------";
    }
}


