public class Aula05EstruturasCondicionais03 {
    static void main() {
        // operador ternário
        // doar caso salary > 5000
        double salary = 2603;
        String messageGive = "Eu vou doar dinheiro";
        String messageNoGive = "Eu não vou doar dinheiro";
        String result = salary > 5000 ? messageGive : messageNoGive;
        System.out.println(result);

        // da pra usar com mais de uma condição, não é recomendável usar, mas é bom saber que existe
        double number = 15553;
        String Result = "";
        Result = number > 5000 ? "Maior que 5000" : number < 2000 ? "Menor que 2000" : number == 3499 ? "Número é 3499" : "Número está entre 4999 e 2001";

        System.out.println(Result);
    }
}
