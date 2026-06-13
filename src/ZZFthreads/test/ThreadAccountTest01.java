package ZZFthreads.test;

import ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable{
    /*
    Aqui estamos vendo um problema de sincronia de Threads, se as duas Threads trabalharem sem sincronia, pode dar muito
    ruim, como no exemplo abaixo, onde o dinheiro foi < 0, porém é possível arrumar isso, usando o modificador
    "synchronized", que faz elas ficarem ordenadas, e acessem o metodo um de cada vez.

    Você pode usar o synchronized em metodos e para sincronizar algo em específico. Quando for sincronizar determinado
    objeto, sempre deixe ele como final, porque se você não criar, você pode pegar esse account como um novo objeto em
    memória alguma hora, e pode bugar o código. (Você tambem pode usar o synchronized em metodos estáticos)
     */
    static void main() {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Matheus");
        Thread t2 = new Thread(threadAccountTest01, "Pedro");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdraw(10);
            if (account.getBalance() < 0){
                System.out.println("FUCK FUCK FUCK");
            }
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    private final Account account = new Account();
    private void withdraw(int amount) {
        System.out.println(getThreadName() + "@#¨@#%¨ OUT OUT OUT");
        synchronized (account) {
            System.out.println(getThreadName() + " In the synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " going to withdraw the money");
                account.withdraw(amount);
                System.out.println(getThreadName() + " withdraw complete, current value of account " + account.getBalance());
            }
            System.out.println("No money to " + getThreadName() + " do the withdraw " + account.getBalance());
        }
    }
    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
