package ZZGconcorrencia.test;

import ZZGconcorrencia.dominio.Quote;
import ZZGconcorrencia.service.StoreServiceWithDiscount;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest05 {
    /*
    Essa é a versão do código usando o CompletableFuture, claro que é um pouquinho pior visualmente falando, mas isso
    poupa 4s, isso porque é só um exemplo, mas na vida real seria uns 40s + ou -

    E tambem vemos duas coisas novas, thenApply() e thenCompose()

    ThenAplly() = transforma o resultdado de um CompletableFuture (cf.thenApply (valor -> transformação)).
    A regra dele é: T --> U
    Use quando for: formatar uma string, converter objeto, calcular valor, e outras coisas dependendo do contexto.

    ThenCompose() = Encadeia outro CompletableFuture (cf.thenCompose(valor -> outroFuture))
    A regra dele é: T --> CompletableFuture<U>
    Ele trabalha com async dentro de async, e evita um CompletableFuture<CompletableFuture<U>>
    Use ele quando a próxima etapa também for assíncrona, como: chamada da API, consulta BD, outra tarefa async, e
    outras dependendo do contexto
     */
    static void main() {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscountAsync(service);
    }

    private static void searchPricesWithDiscountAsync(StoreServiceWithDiscount service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Nvidia", "Google", "Samsung");

        List<CompletableFuture<String>> list = stores.stream().map(s -> CompletableFuture.supplyAsync(
                        () -> service.getPriceSync(s))).map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .toList();

        list.stream().map(CompletableFuture::join).forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %dms%n", (end-start));

    }
}
