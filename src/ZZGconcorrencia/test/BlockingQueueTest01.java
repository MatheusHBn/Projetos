package ZZGconcorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

class RemoveFromQueue implements Runnable {
    private final BlockingQueue<String> blockingQueue;

    public RemoveFromQueue(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        System.out.printf("%s going to sleep for 2s %n", Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(3);
            System.out.printf("%s removing value from queue %s%n", Thread.currentThread().getName(), blockingQueue.take());
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}

public class BlockingQueueTest01 {
    /*
    BlockingQueue e ArrayBlockingQueue, primeiro sobre o blockingQueue, que é uma queue, mas se ela não puder continuar,
    ela espera automaticamente até poder, isso serve tanto para remover e adicionar elemento. Tem alguns metodos principais, como:
    put() = adiciona um item;
    take() = remove um elemento.
    Mas o dois tem a mesma lógica, se a fila estiver vazia ou cheia, eles esperam, outros metodos importantes são:

    offer() = tenta inserir, retorando um true ou false;
    poll() = tenta remover, retorna null se a queue estiver vazia.

    Agora sobre o ArrayBlockingQueue, ele é uma implementação do BlockingQueue. Sempre tem que definir uma quantidade
    máxima (exemplo: new ArrayBlockingQueue<>(5); a capacidade máxima é 5 elementos)

    Os dois são importantes porque, sem eles teríamos que programar tudo isso com lock, condition, wait(), etc. mas
    ja com o blockingQueue é somente put() e take()
     */
    static void main() {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(1);
        try {
            blockingQueue.put("Matheus");
            System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), blockingQueue.peek());
            System.out.println("Trying to add another value");
            new Thread(new RemoveFromQueue(blockingQueue)).start();
            blockingQueue.put("Henrique");
            System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), blockingQueue.peek());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
