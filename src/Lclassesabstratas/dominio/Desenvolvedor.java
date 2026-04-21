package Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario){
        super(nome,salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor: " +this.nome + "\n Salário: " +this.salario;
    }

    @Override
    public void calculaBonus(){
        this.salario = this.salario + this.salario * 0.05;
    }
}
