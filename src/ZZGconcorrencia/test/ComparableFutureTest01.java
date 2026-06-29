package ZZGconcorrencia.test;

import ZZGconcorrencia.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ComparableFutureTest01 {
    /*
    CompletableFuture, já chegamos lá, mas antes disso precisamos entender oque está acontecendo aqui, o código está
    ilustrando a evolução de: síncrono → Future → CompletableFuture. Então vamos por partes:

    1 - Síncrono = mostra o searchPriceSync, e como sai o output dele, o fluxo é de um jeito padrão, onde acontece uma
    coisa de cada vez. Então o get(1) , get(2) e get(3) acontecem linearmente, tudo na mesma Thread;
    2 - Future = agora evoluímos pro Future, onde o searchPriceAsyncFuture faz 3 Threads começar a busca ao mesmo tempo,
    e depois dão os get's(); Mas nesse caso, o get() espera terminar se necessário, mas como as 3 tarefas já estavam
    rodando, então o tempo cai comparado ao anterior;
    3 - CompletableFuture = o comportamento é parecido com o do Future, mas tem algumas mudanças, que serão abordadas
    mais pra frente, mas tem uma agora importante, que é o join(). O join() é parecido com o get(), tem algumas diferenças,
    mas por enquanto veremos só uma:
        1 - o join() não obriga o tratamento de checked exceptions.
    Por enquanto, precisamos saber que Future e CompletableFuture fazem a mesma coisa, que é: obter um resultado futuro,
    mas lá na frente, veremos qual é a real diferença dos dois
     */
    static void main() {
        StoreService service = new StoreService();
//        searchPriceSync(service);
//        searchPriceAsyncFuture(service);
        searchPriceAsyncCompletableFuture(service);
    }

    private static void searchPriceSync(StoreService service){
        long start = System.currentTimeMillis();
        System.out.println(service.getPriceSync("Nvidia"));
        System.out.println(service.getPriceSync("Google"));
        System.out.println(service.getPriceSync("Samsung"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d%n", (end-start));
    }

    private static void searchPriceAsyncFuture(StoreService service){
        long start = System.currentTimeMillis();
            Future<Double> nvidia = service.getPricesAsyncFuture("Nvidia");
            Future<Double> google = service.getPricesAsyncFuture("Google");
            Future<Double> samsung = service.getPricesAsyncFuture("Samsung");
        try {
            System.out.println(nvidia.get());
            System.out.println(google.get());
            System.out.println(samsung.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d%n", (end-start));
        StoreService.shutdown();
    }

    private static void searchPriceAsyncCompletableFuture(StoreService service){
        long start = System.currentTimeMillis();
        CompletableFuture<Double> nvidia = service.getPricesAsyncCompletableFuture("Nvidia");
        CompletableFuture<Double> google = service.getPricesAsyncCompletableFuture("Google");
        CompletableFuture<Double> samsung = service.getPricesAsyncCompletableFuture("Samsung");

        System.out.println(nvidia.join());
        System.out.println(google.join());
        System.out.println(samsung.join());
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d%n", (end-start));
    }
}
