public class Aula05EstruturasCondicionais02 {
    static void main() {
        // casos pra mais de uma condição

        int age = 19;
        if (age < 15){
            System.out.println("Categoria infantil");
        } else if (age >= 15 && age < 18) {
            System.out.println("Categoria Juvenil");
        }else {
            System.out.println("Categoria Adulto");
        }
    }
}
