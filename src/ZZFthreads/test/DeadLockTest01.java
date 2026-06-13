package ZZFthreads.test;

public class DeadLockTest01 {
    /*
    Imagine duas Threads com suas funções, mas de repente, a Thread A precisa pegar algo da função B, mas como
    ela é synchronized, ela espera a Thread B acabar, mas até isso acontecer, ela meio que ignora a sua função, e se
    isso acontecer com a B tambem, as duas vão esperar que uma saia da função, coisa que não vai acontecer, ou seja,
    o sistema fica parado, isso é um DeadLock

    Como no exemplo abaixo, um espera o outro, mas ninguem larga a sua função, e nada anda

     */
    static void main() {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Runnable r1 = () -> {
            synchronized (lock1){
                System.out.println("Thread 1: Holding lock 1");
                System.out.println("Thread 1: Waiting lock 2");
                synchronized (lock2){
                    System.out.println("Thread 1: Holding lock 2");
                }
            }
        };

        Runnable r2 = () -> {
          synchronized (lock2){
              System.out.println("Thread 2: Holding lock 2");
              System.out.println("Thread 2: Waiting lock 1");
              synchronized (lock1){
                  System.out.println("Thread 1: Holding lock 2");
              }
          }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
