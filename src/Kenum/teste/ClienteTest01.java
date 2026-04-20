package Kenum.teste;

import Kenum.dominio.Cliente;
import Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("Matheus", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Thiago", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
