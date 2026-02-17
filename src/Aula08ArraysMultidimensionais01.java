public class Aula08ArraysMultidimensionais01 {
    static void main() {
        // entendendo sobre ararys dentro de arrays, ou seja, arrays multidimensionais
        // (que coisinha complexinha hein, primeira vez que tenho q realmente me esforçar pra entender, mas ainda ta dboa)
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 23;
        dias[0][2] = 58;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        for (int[] arrBase: dias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
