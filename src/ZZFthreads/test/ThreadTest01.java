package ZZFthreads.test;

class ThreadExample extends Thread{
    private char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) System.out.println();
        }
    }
}

class ThreadExampleRunnable implements Runnable{
    private char c;

    public ThreadExampleRunnable(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) System.out.println();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class ThreadTest01 {
    /*
    1)
    Threads, pode ser um objeto ou um processo/linha de execução, elas são o mecanimso que executa em Parallel, então
    se você executar dois metodos, eles são executados ao mesmo tempo

    Existem dois tipos de Threads, Daemon e User
    User: o Java encerra o programa quando todas essas Threads são finalizadas, tem prioridades
    Daemon: Elas não tem tanta prioridade, por exemplo, a Thread que limpa os objetos em memória, se todas as Threads
    users forem finalizadas, ela também vai finalizar.
    Toda Thread tem um nome, e um programa sempre tem uma Thread

    Existem dois jeitos de você criar uma Thread, a primeira é herdando Thread, e a segunda é implementando Runnable
    na primeira, a minha classe vira uma Thread. Na segunda, o Runnable é como se fosse um trabalho pra Thread fazer, e
    a Thread é quem executa da tarefa. Nunca dê dois start's na mesma Thread
------------------------------------------------------------------------------------------------------------------------
    2)
    Existem vários tipo de Threads:
    New = quando a Thread é criada;
    Runnable = quando você deu o start(); nela, ela está preparada pra ser executada;
    Running = quando a Thread está rodando, ela voltar pra Runnable, ir para Waiting/Blocked ou ir para Dead;
    Waiting/Blocked = quando a Thread está bloqueada ou esperando outra Thread;
    Dead = significa que a Thread morreu, então você não pode reutilizar uma Thread, tem que criar outro objeto.

    Vou deixar um mini fluxograma pra ficar mais fácil de visualizar:

                              Waiting/
                  ----------- Blocked
                  |               ^
                  v               |
    New ----> Runnable <----> Running -----> Dead
------------------------------------------------------------------------------------------------------------------------
    3)
    As Threads tem prioridades, que podem ser definidas de 1 à 10, mas é recomendável usar o MAX/MIN/NORMAL Priority
    não é garantido que vai realmente ter uma prioridade, mas é uma indicação pro calendário das Threads (não escreva
    seu código baseado nessa prioridade)

    Você pode fazer uma Thread dormir, usando o Thread.sleep(); mas precisa tratar a exceção que a Thread pode lançar,
    pois pode ocorrer da Thread não dormir, ai vai lançar uma exceção. Ou seja, a Thread entra no modo Waiting/Blocked.

     */
    static void main() {
//        ThreadExample t1 = new ThreadExample('A');
//        ThreadExample t2 = new ThreadExample('B');
//        ThreadExample t3 = new ThreadExample('C');
//        ThreadExample t4 = new ThreadExample('D');
        Thread t1 = new Thread(new ThreadExample('A'), "T1A");
        Thread t2 = new Thread(new ThreadExample('B'), "T2B");
        Thread t3 = new Thread(new ThreadExample('C'), "T3C");
        Thread t4 = new Thread(new ThreadExample('D'), "T3D");
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
