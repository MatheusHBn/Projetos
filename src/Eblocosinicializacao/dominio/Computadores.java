package Eblocosinicializacao.dominio;

public class Computadores {
    /*
    Blcos de Inicialização, é um trecho que sempre incializa quando o objeto é criado,
    até mesmo antes do construtor, ele é utilizado para executar o termo comum que 2 construtores
    utilizariam, é útil pois isso poupa linhas de código
     */


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

    public String getPlacaVideo() {
        return placaVideo;
    }
}
