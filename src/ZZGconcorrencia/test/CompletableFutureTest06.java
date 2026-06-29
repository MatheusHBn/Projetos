package ZZGconcorrencia.test;

import ZZGconcorrencia.dominio.Quote;
import ZZGconcorrencia.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest06 {
    /*
    Mais coisas interessantes acontecem aqui, temos dois novos metodos, allOf() e anyOf(). Algo que os dois tem em comum
    é que os dois recebem varargs, ou seja, Arrays.
    1- allOf() = espera TODAS as tarefas que tem CompletableFuture terminarem, e ele retorna um CompletableFuture<Void>, ou
    seja, não retorna valores;
    2- anyOf = retorna somente o primeiro CompletableFuture terminar, e ele retorna algo meio exótico, CompletableFuture<Object>
    ele retorna isso porque pode ser String, Integer, qualquer tipo.
    Então é só pensar que o allOf funciona como um && e o anyOf funciona como um ||
     */
    static void main() {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscountAsync(service);
    }

    private static void searchPricesWithDiscountAsync(StoreServiceWithDiscount service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Nvidia", "Google", "Samsung");

        var array = stores.stream().map(s -> CompletableFuture.supplyAsync(
                        () -> service.getPriceSync(s))).map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .map(cf -> cf.thenAccept(store -> System.out.printf("%s finished in %d%n", store, (System.currentTimeMillis() - start))))
                .toArray(CompletableFuture[]::new);
//        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(array);
        CompletableFuture<Object> voidCompletableFuture = CompletableFuture.anyOf(array);
        voidCompletableFuture.join();
        System.out.printf("Finished %b%n", voidCompletableFuture.isDone());
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %dms%n", (end-start));

    }
}
