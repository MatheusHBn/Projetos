package ZZGconcorrencia.test;

import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable{
    private String name;
    private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try{
            if(lock.isHeldByCurrentThread()){
                System.out.printf("Thread %s get the lock", name);
            }
            System.out.printf("Thread %s, enter in danger situation", name);
            System.out.printf("%d Threads waiting in queue", lock.getQueueLength());
            System.out.printf("Thread %s go waiting 2s", name);
            Thread.sleep(2000);
            System.out.printf("Thread %s finish the waiting %n", name);
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

public class ReentrantLockTest01 {
    static void main() {
        /*
        Estamos vendo sobre Lock, outra maneira de organizar as Threads, pois o synchronized tem algumas limitações, como:
        Não controlar quando o lock é adquirido, não conseguer tentar adquirir o lock, não consegue esperar por um tempo
        específico e é menos flexível para situações complexas. OBS.: O Synchronized é tipo uma lock automática

        Mas o que é um Lock? Lock é um mecanismo onde só deixa entrar uma Thread numa região crítica.
        E o que é um ReetrantLock? É uma implementação da interface lock. Reetrant significa que a mesma Thread pode ad
        quirir o lock várias vezes, mas lembra de usar o unlock(); para o programa não travar
        e sobre esse tema, tem alguns metodos importantes:

        lock(); = faz a Thread "tranca o código", e enquanto ela não liberar, outras Threads ficam esperando. Sempre use
        o Finally, pois se acontecer alguma exceção, o sistema fica travado.
        unlock(); = desbloqueia o código, deixando outras Threads executarem o código
        tryLock(); = diferente do synchronized, se a Thread ver que tem um lock, ela não fica esperando até o lock abrir,
        ela vai para alguma outra tarefa.
         */
        ReentrantLock lock = new ReentrantLock(true);
        new Thread(new Worker("A", lock)).start();
        new Thread(new Worker("B", lock)).start();
        new Thread(new Worker("C", lock)).start();
        new Thread(new Worker("D", lock)).start();
        new Thread(new Worker("E", lock)).start();
        new Thread(new Worker("F", lock)).start();
        new Thread(new Worker("G", lock)).start();
    }
}
