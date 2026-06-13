package ZZFthreads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    /*
    Vamos falar sobre Wait, Notify e NotifyAll, que são metodos para melhorar a usuabilidade das Threads, mas antes, é
    importante saber que para usar wait, sempre use quando você tiver algum objeto em synchronized

    Wait = A Thread assume que não tem nada para fazer, então ela  espera até alguem avisar o que tem que fazer, libera
    o lock (posse) do objetom e fica parada
    Notify = Avisa umas das Threads que tem que trabalho para fazer
    NotifyAll = Avisa todas as Threads que tem trabalho para fazer
     */
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen(){
        return open;
    }

    public int pendingEmails(){
        synchronized (emails){
            return emails.size();
        }
    }

    public void addMemberEmail(String email){
        synchronized (this.emails){
            String threadname = Thread.currentThread().getName();
            System.out.println( threadname + " New member added of list ");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException{
        System.out.println(Thread.currentThread().getName() + " checking if there are emails ");
        synchronized (this.emails){
            while(this.emails.size() == 0){
                if(!open) return null;
                System.out.println(Thread.currentThread().getName() + " No haves emails in list, joining in mode waiting ");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }
    public void close() {
        open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " Notifying everbody that we don't getting emails ");
        }
    }
}
