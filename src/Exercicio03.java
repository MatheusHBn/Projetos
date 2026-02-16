public class Exercicio03 {
    static void main() {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte DayUsefull = 6;
        switch (DayUsefull){
            case 1:
                System.out.println("Domingo: Não é dia útil");
                break;
            case 2:
                System.out.println("Segunda: É dia útil");
                break;
            case 3:
                System.out.println("Terça: É dia útil");
                break;
            case 4:
                System.out.println("Quarta: É dia útil");
                break;
            case 5:
                System.out.println("Quinta: É dia útil");
                break;
            case 6:
                System.out.println("Sexta: É dia útil");
                break;
            case 7:
                System.out.println("Sábado: Não é dia útil");
                break;
            default:
                System.out.println("Coloque um dia da semana, de 1 á 7.");
                break;

                /*
                Outra forma de ser feita

                switch(DayUsefull) {
                case 1:
                case 7:
                    System.out.println("Fim de Semana");
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Dia Útil");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
                }
                 */
        }
    }
}
