package Lclassesabstratas.teste;


import Lclassesabstratas.dominio.Desenvolvedor;
import Lclassesabstratas.dominio.Funcionario;
import Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    static void main(){
        Gerente gerente = new Gerente("Thiago", 23445);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Luis" , 8338);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
