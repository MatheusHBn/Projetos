package Oexcecao.Error.test;

public class StackOverflowTest01 {
    /*
    Exceções, esse tópico é meio extenso, mas vou dar uma resumida para falar disso dps

    Exceções e erros são coisas diferentes, antes de qualquer coisa. Enquato erros são coisas que a JVM
    não consegue resolver, exceções são problemas que a JVM pode resolver e continuar executando o programa.

    um mapa abaixo para representar melhor a hierarquia

                ----> Throwable  <-----
                |                    |
              Error         --->  Exception  <------------
                            |                           |
                            |                           |
                      RunTimeException              IOException
                             |                      SQLException
                      NullPointerException
                      ArithmeticException

     Ou seja, erros e exceções são filhas de Throwable, e existem 2 tipos de exceções, as checkd (exceções)
     que precisam de tratamento, se não, o código não executa, e as unchecked (RunTimeException), que podem
     ser tratadas, mas não é obrigatório

    Agora falando um pouco de Error, nesse código, o que acontece para ter o erro StackOverflow é,
    eu criei umm metodo que se chama, e fiz ele chamar-se no main, então ele fica se chamando
    infinitamente, o que uma hora ou outra, causa o limite da memória

    Isso é só um tipo de vários erros que existem, esse foi um exemplo básico
     */
    static void main() {
        recursivo();
    }
    public static void recursivo(){
        recursivo();
    }
}
