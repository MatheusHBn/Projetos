package ZZGconcorrencia.test;

import ZZGconcorrencia.service.StoreServiceDeprecated;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureTest03 {
    /*
       Aqui aparece algumas coisas novas, a primeira é a ThreadFactory, que é um objeto responsável por criar Threads.
       Ele é um dos parâmetros do ExecutorService, depois do número de Threads.

       Além disso, perceba que tem um metodo novo, "supplyAsync()", esse metodo usa Threads em background e cria um
       CompletableFuture assíncrono. Esse metodo tem essa base:
       CompletableFuture.supplyAsync( tarefa, executor), você pode ver isso lá em baixo.
     */
    static void main() {
        StoreServiceDeprecated service = new StoreServiceDeprecated();
        searchPriceAsyncCompletableFuture(service);
    }
    private static void searchPriceAsyncCompletableFuture(StoreServiceDeprecated service){
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(10, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });

        List<String> stores = List.of("Nvidia", "Google", "Samsung");
        List<CompletableFuture<Double>> list = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s), executorService)).toList();

        List<Double> doubles = list.stream().map(CompletableFuture::join).toList();

        System.out.println(doubles);
        long end = System.currentTimeMillis();
        executorService.shutdown();
        System.out.printf("Time passed to searchPriceSync %d%n", (end-start));
    }
}
