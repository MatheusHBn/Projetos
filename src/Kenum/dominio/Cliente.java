package Kenum.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;

    public Cliente(String nome, TipoCliente tipoCliente){
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString(){
        return "Nome = " + nome + '\'' + "tipo = " + tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
