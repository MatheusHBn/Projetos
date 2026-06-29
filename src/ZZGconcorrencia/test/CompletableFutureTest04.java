package ZZGconcorrencia.test;

import ZZGconcorrencia.dominio.Quote;
import ZZGconcorrencia.service.StoreServiceWithDiscount;

import java.util.List;

public class CompletableFutureTest04 {
    /*
    Criamos várias classes: Discount, Quote, StoreServiceWithDiscount. Tudo isso para vermos como seria sem usar o
    CompletableFuture, ou seja, tudo isso é sincrono, tudo roda na mesma Thread.
    (olhe o tempo que demorou pra completar o programa, para comparar depois usando o CompletableFuture)
     */
    static void main() {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscount(service);
    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Nvidia", "Google", "Samsung");
//        stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        stores.stream().map(service::getPriceSync).map(Quote::newQuote).map(service::applyDiscount).forEach(System.out::println);
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %dms%n", (end-start));

    }
}
