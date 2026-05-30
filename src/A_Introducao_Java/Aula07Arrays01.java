package A_Introducao_Java;

public class Aula07Arrays01 {
    static void main() {
        /* opa, a partir daqui, vou começar a detalhar melhor os códigos que eu tinha feito (os comentários serão do Matheus do futuro)
        então pra começar, oque são Arrays? Array é uma estrutura que guarda vários valores em sequência, usando um único nome
        como uma fileira, por exemplo. Como funciona? voce tem que primeiro inicializar ela com colchetes ( [] ) de algum tipo primitivo
        (ou String), e depois declarar quantas pessoas (elementos) tem na fila (array)

        OBS.: todos os comentários que você ver com o /* são os comentários feitos pelo Matheus do futuro
        */
        int[] numeros = new int[3];
        numeros[1] = 25;
        numeros[0] = 13;
        numeros[2] = 76;
        System.out.println(numeros[1]);
        System.out.println(numeros[0]);
        System.out.println(numeros[2]);
    }
}
