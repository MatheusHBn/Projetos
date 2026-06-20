package ZZGconcorrencia.test;

import java.util.concurrent.*;

class RandomNumber implements Callable<String>{


    @Override
    public String call() throws Exception {
//        Math.random();
        int count = ThreadLocalRandom.current().nextInt(1, 20);
        for (int i = 0; i < count; i++) {
            System.out.printf("%s executing one callable task...%n", Thread.currentThread().getName());
        }
        return String.format("%n%s finished and the random number is %d ", Thread.currentThread().getName(), count);
    }
}

public class CallableTest01 {
    /*
    Callable, muito parecido com o Runnable, a diferença é que o Callable precisa devolver um resultado (diferente do
    Runnable, que só executa algo). Ela tem o metodo call() onde precisa de um tipo de retorno, por isso o Callable usa
    Generics.

    "Mas porque usa Callable ao invés de Runnable?", alguns motivos são:
    1- funções que dependem de um resultado que vai ser obtido fica presa dentro de uma Thread, exemplo: se eu quiser
    fazer 10 + 20, o resultado fica preso, você não consegue recupera-lo diretamente (ou seja, o metodo do Runnable é void,
    enquanto o do Callable não é);
    2- Runnable não pode lançar exceções verificadas diretamente, já o Callable pode, porque o metodo já declara
    ( call() throws Exception ).

    E como Callable é uma interface funcional, tambem pode usar Lambda

    OBS.: não é recomendado usar Math.random() quando você está trabalhando com Threads, pois o Math é sincronizado,
    ou seja, vai ter um lock, então as Threads vão entrar em estado wait, então use o ThreadLocalRandom quando for
    trabalhar multiThreads.
     */
    static void main() throws ExecutionException, InterruptedException {
        RandomNumber randomNumber = new RandomNumber();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(randomNumber);
        String s = future.get();
        System.out.printf("Program finished %s", s);
        executorService.shutdown();
    }
}
