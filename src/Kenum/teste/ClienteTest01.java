package Kenum.teste;

import Kenum.dominio.Cliente;
import Kenum.dominio.TipoCliente;
import Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("Matheus", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Thiago", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calculaDesconto(200));
        System.out.println(TipoPagamento.CREDITO.calculaDesconto(200));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);
        TipoCliente tipoCliente1 = TipoCliente.NomeJuridico("Pessoa Fisica");
        System.out.println(tipoCliente1);
    }
}
