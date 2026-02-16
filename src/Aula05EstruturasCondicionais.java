public class Aula05EstruturasCondicionais {
    static void main() {
        // aprendendo como o if funciona
        int age = 14;
        boolean isAuthorizedToPurchaseAlcool = age >= 18;

        if (isAuthorizedToPurchaseAlcool == true) {
            System.out.println("Autorizado");
        }
        if (!isAuthorizedToPurchaseAlcool)
            System.out.println("Não Autorizado");

        // aprendendo como o else funciona

        int age1 = 52;
        boolean isAuthorizedToPurchaseAlcool1 = age1 >= 18;

        if (isAuthorizedToPurchaseAlcool1 == true) {
            System.out.println("Autorizado");
        }
        else {
            System.out.println("Não Autorizado");
        }
    }
}
