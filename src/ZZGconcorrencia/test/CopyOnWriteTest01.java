package ZZGconcorrencia.test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import java.util.concurrent.TimeUnit;

public class CopyOnWriteTest01 {
    /*
    CopyOnWriteArrayList, é uma implementação de List, feita para concorrência.
    Ela cria uma cópia da lista quando alguem altera ela, adiciona o elemento e depois substitui a antiga pela nova.
    Ela é útil pra justamente esse problema, quando há mais de uma Thread para modificar uma lista ou ler uma lista,
    evitando muitas exceptions
     */
    static void main() {
        List<Integer> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }

        Runnable runnableIterator = () -> {
            Iterator<Integer> iterator = list.iterator();
            try {
                TimeUnit.SECONDS.sleep(2);
                iterator.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
            Runnable runnableRemove = () -> {
                for (int i = 0; i < 250; i++) {
                    System.out.printf("%s removed %d%n", Thread.currentThread().getName(), i);
            }
        };

        new Thread(runnableIterator).start();
        new Thread(runnableIterator).start();
        new Thread(runnableRemove).start();
    }
}
