public class Aula07Arrays03 {
    static void main() {
        //basicamente aprendendo a usar o array em for
        int[] numeros = new int[5];
        int[] numeros1 = {1,2,3,4,5};
        int[] numeros02 = new int[]{11,35,32,44,58,76};

        for (int i = 0; i < numeros02.length; i++) {
            System.out.println(i);

        }
        for (int num:numeros02){
            System.out.println(num);
        }
    }
}
