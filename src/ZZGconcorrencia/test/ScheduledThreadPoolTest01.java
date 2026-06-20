package ZZGconcorrencia.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest01 {
    /*
    Schedule's, existem três: o schedule normal, com delay e o fixo. Pra criar um ScheduleExecutor, tem que usar o
    newScheduleThreadPool(). Os três metodos:

    1- schedule() = executa uma única vez após um tempo
    2- scheduleAtFixedRate() = Executa periodicamente em uma taxa fixa, com os parâmetros: tarefa, delay inicial,
    período e unidade. Ele executa -> espera até o próximo horário -> executa denovo. Ele tenta manter o horário fixo,
    independente de quanto tempo levou.
    3- scheduleWithFixedDelay = também executa repetidamente, só que o cálculo é diferente, agora ele executa -> termina
    -> espera -> executa denovo, a contagem começa após o término da tarefa

    Observe o exemplo, com o tempo da tarefa = 3s; e o período/delay = 5s:

    scheduleAtFixedRate                                         scheduleWithFixedDelay

       0s  -> inicia                                                0s  -> inicia
       3s  -> termina                                               3s  -> termina
       5s  -> inicia                                                8s  -> inicia
       8s  -> termina                                               11s -> termina
       10s -> inicia                                                16s -> inicia
       13s -> termina                                               19s -> termina

    A diferença do 2 para o 3 é, o 3 conta a partir do ínicio das execuções. Enquanto o 2 conta a partir do fim das
    execuções

     */
    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    private static void beeper() {
        Runnable r = () -> {
            System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + " beeeppp!!!!");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            beeper();
        };
//            executor.schedule(r,1, TimeUnit.SECONDS);
//        ScheduledFuture<?> scheduledFuture = executor.scheduleWithFixedDelay(r, 1, 1, TimeUnit.SECONDS);
        ScheduledFuture<?> scheduledFuture = executor.scheduleAtFixedRate(r, 1, 2, TimeUnit.SECONDS);
        executor.schedule( () -> {
            System.out.println("Stopping the scheduleWithFixedDelay");
            scheduledFuture.cancel(false);
        },1 , TimeUnit.SECONDS);
    }

    static void main() {
        beeper();
    }
}
