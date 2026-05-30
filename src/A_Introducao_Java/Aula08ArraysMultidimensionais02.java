package A_Introducao_Java;

public class Aula08ArraysMultidimensionais02 {
    // aprendendo sobre um mesmo array que cada parte dele pode ter outros arrays de tamanhos diferentes
    static void main() {

        /*
        Aqui acontece algo interessante, na segunda array, você não precisa declarar o tamanho dela
         */

        int[][] ArrayInt = new int[3][];

        /*
        Aqui estão outros modos de inicializar uma array, e como declarar os valores delas

        1 - ArrayInt[0] = new int[]{x,x,x}
        aqui, como você já declarou o tamanho da primeira, você só usa as {} para declarar os valores da segunda

        2 - int[][]ArrayInt2 = {{x,x},{x,x}}
        nesse caso, você só está declarando os valores da segunda array, note que os valores estão dentro de duas chaves ( {{x,x}} )

         */

        ArrayInt[0] = new int[]{12,8,5};
        ArrayInt[1] = new int[]{1,2,3};
        ArrayInt[2] = new int[]{67,54,12};

        int[][]ArrayInt2 = {{0,0},{4,6},{87,23}};

        for (int[] ArrayBase: ArrayInt) {
            System.out.println("\n------");
            for (int num: ArrayBase)
                System.out.print(num + " ");
        }
    }
}
