public class Exercicio {
    public static void main(String[] args) {
        /*
        Prática

        Crie variáveis para campos descritos abaixo entre <> e imprima a seguinte mensagem:

        Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>.

         */
        String name = "Matheus";
        String address = "Rua Salvador dali";
        short addressNumber = 55;
        double salary = 4000;
        String data = "14/02/2026";
        String relatorio =  "Eu "+name+", morando no endereço "+address+addressNumber+", confirmo que recebi o salário de "+salary+", na data "+data;

        System.out.println(relatorio);
    }
}
