package ZZGconcorrencia.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printer implements Runnable{
    private final int num;

    public Printer(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%s início: %d%n", Thread.currentThread().getName(), num);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.printf("%s finalizou %n", Thread.currentThread().getName());
    }
}

public class ExecutorsTest01 {
    /*
    Executors (muito importante), é uma fábrica de pools de Threads, por enquanto, é só saber que Executors é um meio de
    criar Threads e reutiliza-las. Tem uns metodos importantes, como:
    execute() = executa o programa;
    newFixedThreadPool() = número fixo de Threads que vão rodar;
    shutdown() = termina o executors (sem isso, o programa não pode encerrar, pois o executor ainda está rodando);
    newSingleThreadExecutor() = apenas uma Thread vai executar o programa;
    newCachedThreadPool() = cria Threads conforme necessário, e reutiliza Threads ociosas (muito útil).
     */
    static void main() {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(new Printer(1));
        executorService.execute(new Printer(2));
        executorService.execute(new Printer(3));
        executorService.execute(new Printer(4));
        executorService.execute(new Printer(5));
        executorService.execute(new Printer(6));
        executorService.shutdown();
    }
}
