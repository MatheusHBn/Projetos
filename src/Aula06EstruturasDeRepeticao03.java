public class Aula06EstruturasDeRepeticao03 {
    static void main() {
        // como o Continue funciona?
        // vou fazer um código simples de exemplo, mas basicamente nenhum codigo passa por ele enqt ele tiver/ for verdadeiro

        int numero = 20;
        for (int i = 0; i < numero; i++) {
            if (i == 6 || i == 10){
                continue;
            }
            System.out.println(i);
        }
    }
}
