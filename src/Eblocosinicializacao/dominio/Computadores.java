package Eblocosinicializacao.dominio;

public class Computadores {
    private String placaVideo;
    private int[] modulos;
    {
        System.out.println("DENTRO DO I");
    }

    public Computadores(String placaVideo){
        this.placaVideo = placaVideo;
    }

    public Computadores(){
        modulos = new int[3];
        for (int i = 0; i < modulos.length; i++) {
            modulos[i] += i;
        }
        for (int modulos: this.modulos)
            System.out.println(modulos+ " ");
    }

    public int[] getModulos() {
        return modulos;
    }
}
