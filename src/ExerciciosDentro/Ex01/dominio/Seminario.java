package ExerciciosDentro.Ex01.dominio;

public class Seminario {
    private String titulo;
    private Estudante[] estudantes;
    private Local local;

    public Seminario(String titulo){
        this.titulo = titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setEstudante(Estudante[] estudantes){
        this.estudantes = estudantes;
    }

    public void setLocal(Local local){
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void imprime(){
        System.out.println("Seminário: "+this.titulo);
        if (estudantes == null){
            System.out.println("Não há estudantes neste seminário");
        } else {
            for (Estudante estudante : estudantes){
                System.out.println("Aluno(s): "+estudante.getNome());
            }
        }
        System.out.println("O seminário ocorrerá no(a): "+local.getEndereco());
    }
}
