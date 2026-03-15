package ExerciciosDentro.Ex01.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudante(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSeminario(Seminario seminario){
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void imprime(){
        System.out.println("Aluno(a): "+this.nome);
        System.out.println("Idade: "+this.idade);
        if (seminario == null){
            System.out.println(this.nome+ " Não está em nenhum seminário");
        } else {
            System.out.println("O aluno está no seguinte seminário: "+seminario.getTitulo());
        }
    }
}
