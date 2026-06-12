package Hheranca.dominio;

public class Funcionario extends Pessoa {
    /*
    Outra coisa importante de dizer é que,se voce reparar, verá um "super" no construtor, o que acontece é:
    o Java precisa saber como inicializar esse construtor, mas como a classe Funcionário é herdado a pessoa,
    o super chama o construtor da classe pai, e executa ele

    todo o construtor que for herdado twm que ter os supers da classe pai, se não, não inicializa, e o construtor
    tambem pode ser sobreescrito com aspectos da classe funcionario que não tem em pessoa
     */
    private double salario;

    static {
        System.out.println("dentro do estatico");
    }
    {
        System.out.println("Fora do estático");
    }
    {
        System.out.println("Fora do estático");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome +", recebi o salario de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
