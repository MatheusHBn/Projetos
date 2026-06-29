package ZZGconcorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    /*
    Future,é um resultado que vai ser produzido, e como pode ver, lá embaixo tem um future.get(), ou seja, ele pega o
    resultado futuro. Tem alguns metodos:
    1- get() = verifica se a tarefa terminou, se sim, retorna o valor, se não, a Thread atual fica esperando (tambem tem
    o get() com timeout, que você define um tempo para pegar o resultado, se não pegar, lança um TimeoutException);
    2- isdone() = verifica se terminou a tarefa, retorna true ou false;
    3- cancel() = cancela a tarefa ( para verificar se foi cancelada, isCancelled() ).

    Cuidado com o uso do get(), se você usar o Executor junto com ele, você trava a sua Thread, então note que o get() e
    Executor nunca estão juntos diretamente (no mesmo metodo).
     */
    static void main() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
       Future<Double> dollar = executorService.submit(() -> {
           TimeUnit.SECONDS.sleep(5);
           return 4.35D;
       });
        System.out.println(doingSomething());
        Double dollarRequest = null;
        try {
            dollarRequest = dollar.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }
        System.out.println("Dollar: " + dollarRequest);
        executorService.shutdown();
    }

    private static long doingSomething(){
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum += i;
        }
        return sum;
    }
}
