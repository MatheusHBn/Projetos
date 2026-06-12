package Fmodificadorestatico.domain;

public class Computadores {
    /*
   Bloco de inicialização estático, inicializa apenas uma vez,usado geralmente para definir configurações
   antes da classe ser utilizada
     */


    private String placaVideo;
    private static int[] modulos;

    static  {
        System.out.println("\nDENTRO DO I");
    }

    public Computadores(String placaVideo){
        this.placaVideo = placaVideo;
    }

    public Computadores(){
        modulos = new int[98];
        for (int i = 0; i < modulos.length; i++) {
            modulos[i] += i;
        }
        for (int modulos: Computadores.modulos)
            System.out.print(modulos+ " ");
    }

    public int[] getModulos() {
        return modulos;
    }
}
