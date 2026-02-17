public class Exercício04 {
    static void main() {
        //imprimir todos os numeros pares ate 1M
        int count = 0;
        while(count < 1000000){
            if (count % 2 == 0) {
                System.out.println(count);
                count = count + 2;
            }
        }
        for (count=1;count<1000000; count++){
            if (count % 2 == 0){
                System.out.println("For "+ count);
            }
        }
    }
}
