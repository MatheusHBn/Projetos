package ZZGconcorrencia.service;

import ZZFthreads.dominio.Members;

public class EmailDeliveryService implements Runnable{
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " startin to deliver emails... ");
        while(members.isOpen() || members.pendingEmails() > 0){
            try {
                String retrieveEmail = members.retrieveEmail();
                if (retrieveEmail == null) continue;
                System.out.println(threadName + " deliverying email to " + retrieveEmail);
                Thread.sleep(2000);
                System.out.println(threadName + " email deliver sucess to " + retrieveEmail);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
