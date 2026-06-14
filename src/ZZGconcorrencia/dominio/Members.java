package ZZGconcorrencia.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    /*
    Condition, como você pode ver, esse código é quase o mesmo q o de Threads, mas tem uma mudança, que agora usaremos
    o Condition, que é uma versão moderna dos:
    wait() == await()
    notify == signal()
    notifyAll == signalAll()

    "Tá, mas porque usar o Condition e não o que a gente usava?", porque ele é mais flexível e funciona melhor com o
    ReentrantLock, e você pode meio que deixar Threads separadas por função, por exemplo:

    Você tem uma fila que só pode guardar 10 itens, existem dois tipos de Threads, as produtoras que colocam itens, e as
    consumidoras que removem itens. Se você usar o notify(), você pode acordar uma Thread errada, mas com o Condition,
    você pode criar duas condições, que seriam: filaCheia e filaVazia, agora basta você dar um filaCheia/Vazia.signal(),
    que somente um grupo de Threads acorda.
     */
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public boolean isOpen(){
        return open;
    }

    public int pendingEmails() {
        lock.lock();
        try {
            return emails.size();
        } finally {
            lock.unlock();
        }
    }

    public void addMemberEmail(String email){
        lock.lock();
        try {
            String threadname = Thread.currentThread().getName();
            System.out.println( threadname + " New member added of list ");
            this.emails.add(email);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public String retrieveEmail() throws InterruptedException{
        System.out.println(Thread.currentThread().getName() + " checking if there are emails ");
        lock.lock();
        try {
            while(this.emails.size() == 0){
                if(!open) return null;
                System.out.println(Thread.currentThread().getName() + " No haves emails in list, joining in mode waiting ");
                condition.await();
            }
            return this.emails.poll();
        } finally {
            lock.unlock();
        }
    }
    public void close() {
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Notifying everbody that we don't getting emails ");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}