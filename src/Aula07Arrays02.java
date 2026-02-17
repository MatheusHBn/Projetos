public class Aula07Arrays02 {
     static void main() {
         //byte, short, int, long, float e double, o valor inicial é = 0; no char é '/u000'; boolean é false; e String é null
         // arrays sempre serão objetos
        String[] nomes = new String[4];
        nomes[0] = "Letícia";
        nomes[1] = "Larissa";
        nomes[2] = "Amanda";
        nomes[3] = "Raíssa";

         for (int i = 0; i < nomes.length; i++) {
             System.out.println(nomes[i]);
         }
    }
}
