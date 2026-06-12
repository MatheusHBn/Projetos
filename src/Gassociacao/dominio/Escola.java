package Gassociacao.dominio;

/*
Assosiação, é você fazer alguns objetos, e interligar eles entre si, geralmente com algum atributo,
que ao inves de voce colocar um tipo primitivo ou uma string, você coloca o objeto em questão

geralmnete não é difícil, mas dependendo do numeros do objetos, pode ser confuso
 */

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome){
        this.nome = nome;
    }


    public Escola(String nome, Professor[] professores){
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (professores == null) return;
        for (Professor professor: professores){
            System.out.println(professor.getNome());
        }
    }

    public String getNome() {
            return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Professor[] getProfessores(){
        return professores;
    }
}
