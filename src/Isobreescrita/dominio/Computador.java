package Isobreescrita.dominio;

public class Computador {
    /*
    Sobrescrita, e literalmente o nome, você sobrescreve um método que já existi, e claro que
    voce tem que sobrescrever de acordo com a logica do método, e de preferencia, com a tag
    @Override
     */

    private String processador;

    @Override
    public String toString(){
        return  "Processador: " + this.processador;
    }

    public Computador(String processador) {
        this.processador = processador;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
}
