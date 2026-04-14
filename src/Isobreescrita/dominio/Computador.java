package Isobreescrita.dominio;

public class Computador {
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
