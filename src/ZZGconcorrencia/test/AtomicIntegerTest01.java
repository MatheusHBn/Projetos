package ZZGconcorrencia.test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();
    private Lock lock = new ReentrantLock(true);
    void increment() {
        lock.lock();
        try{
            count++;
        } finally {
            lock.unlock();
        }
        count++;
        atomicInteger.incrementAndGet();
    }

    public int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}

public class AtomicIntegerTest01 {
    /*
    Concorrência, é o problema em si das Threads brigando, e as Threads são as ferramentas para implementar concorrência
    Então um problema sem concorrência executa cada tarefa dependendo da ordem que foi colocada no metodo, já as Threads
    executam o programa simultâneamente. Ou seja, concorrência é quando duas tarefas progridem no mesmo período.

    AtomicInteger, é uma classe para esse tipo de situação, ela garante que a operação será segura mesmo com várias Threads.
    Atomic significa "indivísivel", ou seja, a operação acontece de uma vez. Dois metodos importantes são os:
    IncrementAndGet(); = incrementa e retorna o novo valor
    GetAndIncrement(); = retorna o valor atual e depois incrementa

    Uma observação importante, é que essa só existe para Long, Boolean, Integer e os seus tipos em Array

     */
    static void main() throws InterruptedException {
        Counter counter = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
        System.out.println(counter.getAtomicInteger());
    }
}
