package A_exercicios;

public class Exercício05 {
    static void main() {

//        Uma frase é um palíndromo se, após converter todas as letras maiúsculas em minúsculas e remover todos os caracteres
//        não alfanuméricos, ela puder ser lida da mesma forma de frente para trás e de trás para frente. Caracteres alfanuméricos incluem letras e números.
//
//        Dada uma string s, retorne true se ela for um palíndromo, ou false caso contrário.

//        Exemplo 1
//        Entrada: s = "A man, a plan, a canal:Panama"
//        Saída: true
//        Explicação:
//        Após converter tudo para minúsculo e remover caracteres não alfanuméricos, a string fica:
//        "umhomemumplanoumcanalpanama"
//        Ela é igual ao ser lida de trás para frente, portanto é um palíndromo.
//
//        Exemplo 2
//        Entrada: s = "race a car"
//        Saída: false
//        Explicação:
//        Após o tratamento da string:
//        "raceacar"
//        Ela não é igual ao seu inverso, então não é um palíndromo.
//
//        Exemplo 3
//        Entrada: s = " "
//        Saída: true
//        Explicação:
//        Depois de remover os caracteres não alfanuméricos, sobra uma string vazia "".
//        Uma string vazia é considerada um palíndromo, pois pode ser lida igualmente nos dois sentidos.

        String s1 = "oaao";
        String s2;
        s1 = s1.toLowerCase();
        s1 = s1.trim();
        s1 = s1.replaceAll("[\\p{Punct}\\s]", "");

        s2 = new StringBuilder(s1)
                .reverse()
                .toString();

        s2 = s2.toLowerCase();

        System.out.println("Primeira palavra: " + s1);
        System.out.println("Segunda palavra: " + s2);

        if (s1.equals(s2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
