package ZZGconcorrencia.test;

import ZZGconcorrencia.service.StoreService;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest02 {
    /*
        Nesse código, é como fazer a mesma coisa do CompletableFutureTest01, mas com Streams, que fica visualmente
        melhor. Só tome cuidado nas streams, você precisa separar ela, se não, fica síncrono.
     */
    static void main() {
        StoreService service = new StoreService();
        searchPriceAsyncCompletableFuture(service);
    }
    private static void searchPriceAsyncCompletableFuture(StoreService service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Nvidia", "Google", "Samsung");
        List<CompletableFuture<Double>> collect =
                stores.stream().map(service::getPricesAsyncCompletableFuture).toList();
        List<Double> collected = collect.stream().map(CompletableFuture::join).toList();
        System.out.println(collected);
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d%n", (end-start));
    }
}
