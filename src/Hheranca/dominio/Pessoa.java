package Hheranca.dominio;

public class Pessoa {
    /*
    Herança, como o nome já diz, é você pegar um objeto, e fazer outro objeto herdar os atributos e métodos dele,
    e esses métodos podem ser sobreescritos, para usar a herança, usar o "extends" do lado do nome da classe, importante mencionar que não é
    possível fazer um objeto herdar os atributos de duas classes diferentes, e nessa analogia, é possível
   ter: um vô, pai filho, etc. mas começa a ficar confuso ate certo ponto
     */
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("dentro do estatico");
    }
    {
        System.out.println("Fora do estático");
    }
    {
        System.out.println("Fora do estático");
    }


    public Pessoa(String nome){
        this.nome = nome;
        System.out.println("Dentro de construtor pessoa");
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }
}
