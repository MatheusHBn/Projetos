package ZZFthreads.test;



class ThreadExampleRunnable2 implements Runnable{
    private String c;

    public ThreadExampleRunnable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) System.out.println();
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

public class ThreadTest02 {
    /*
    Yield e Join, começando pelo Yield, ele é um metodo que da uma dica pra uma Thread dar uma pausa, ou seja, faz
    a Thread Running voltar pra Runnable.
    Já o Join, ele ta falando pra Thread main assim: "Você não pode fazer isso até a outra acabar", ou seja, ele fala
    pro main que ele não pode prosseguir enquanto x Thread não terminar, é tipo um break até alguma Thread acabar.
     */
    static void main() throws RuntimeException, InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable2("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnable2("MI"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t1.join();
        t2.start();
    }
}
