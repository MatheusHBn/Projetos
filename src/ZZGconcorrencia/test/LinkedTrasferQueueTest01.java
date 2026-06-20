package ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTrasferQueueTest01 {
    /*
    LinkedTrasferQueue, é uma junção de três queue's: ConcurrentLinkedQueue, SynchronousQueue e LinkedBlockQueue.
    Ela é uma Queue muito eficiente para a comunicação entre Threads, pois ela permite que uma Thread saiba se existe
    outra para receber certa função. Ela tem uns metodos bem importantes, como:

    transfer() = bloqueia a thread do "produtor" até que uma thread "consumidora" aceite o elemento transferido;
    tryTransfer() = versão do transfer que não bloqueia o código, retorna true ou false;
    hasWaitingConsumer() = verifica se existe um "consumidor" esperando, retorna true ou false;
    element() = retorna o elemento que está no início da fila (o "head") sem removê-lo;
    remainingCapacity() = mostra a quantidade de elementos que a queue tem.

    Ela é útil quando há comunicação direta entre as Threads.
     */
    static void main() {
        TransferQueue<Object> transferQueue = new LinkedTransferQueue<>();
        System.out.println(transferQueue.add("Matheus"));
        try {
            System.out.println(transferQueue.offer("Henrique", 10, TimeUnit.SECONDS));
            transferQueue.put("Henrique");
            if (transferQueue.hasWaitingConsumer()){
                transferQueue.transfer("Henrique");
            }
            System.out.println(transferQueue.tryTransfer("Thiago"));
            System.out.println(transferQueue.tryTransfer("Thiago", 5, TimeUnit.SECONDS));
            System.out.println(transferQueue.remainingCapacity());
            System.out.println(transferQueue.element());
            System.out.println(transferQueue.peek());
            System.out.println(transferQueue.poll());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
