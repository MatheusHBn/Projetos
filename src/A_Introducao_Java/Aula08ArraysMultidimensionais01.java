package A_Introducao_Java;

public class Aula08ArraysMultidimensionais01 {
    static void main() {
        // entendendo sobre ararys dentro de arrays, ou seja, arrays multidimensionais
        // (que coisinha complexinha hein, primeira vez que tenho q realmente me esforçar pra entender, mas ainda ta dboa)

        /*
        E não, não é tão difícil quanto parece, em Arrays Multidimensionais, você pode declarar uma array dentro de outra, então é um elemento
        dentro de outro elemento, então uma array [0][1] é mais ou menos assim:

            0            1            2
         0  1  2      0  1  2      0  1  2

        entendendo o exemplo acima, entender o conceito fica beem mais fácil
         */

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 23;
        dias[0][2] = 58;

        /*
        Agora sobre como fazer pra imprimir os valores, você tem que fazer um for para ler a primeira array ( o for que
        usa o "i" é o que lê a primeira array) e fazer um for dentro desse for da primeira array, para ler a segunda ( o for
        que usa o "j" é o que lê a segunda array)
         */

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        /*
        Agora, para fazer a mesma coisa no ForEach:

         1 - você pega a array que você fez, e implemente ela no ForEach (nesse caso, eu pego a array "dias" e renomeio ela como
         "arrBase"
         2 - agora você faz a mesma coisa que você fez, mas agora na arrBase ( você pega a array que você renomeiou, e faz a mesma coisa)
         3 - por fim, de System.out.println no "num", que é a segunda array

         OBS.: no ForEach, note que quando eu renomeio a primeira array, eu uso o int[], e no segundo eu só uso o int, isso acontece
         porque o tipo da primeira array, é uma array, só que a segunda array são ints, então sempre lembre disso
         */

        for (int[] arrBase: dias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
