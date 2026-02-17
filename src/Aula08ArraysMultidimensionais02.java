import java.util.Arrays;

public class Aula08ArraysMultidimensionais02 {
    //aprendendo sobre um mesmo array que cada parte dele pode ter outros arrays de tamanhos diferentes
    static void main() {
        int[][] ArrayInt= new int[3][];

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
