package ExerciciosDentro.Ex01.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public void setSeminarios(Seminario[] seminarios){
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void imprime(){
        System.out.println("Professor(a): "+this.nome);
        System.out.println("Especializado(a) em: "+this.especialidade);
        for (Seminario seminarios: seminarios){
            System.out.println("Ele(a) avaliará o seminário: "+seminarios.getTitulo());
        }
    }
}
