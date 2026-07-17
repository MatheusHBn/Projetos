package ZZIjbdc.test;

import ZZIjbdc.dominio.Producer;
import ZZIjbdc.service.ProducerService;

import java.util.List;

public class ConnectionFactoryTest03 {
    static void main() {
        Producer build = Producer.builder().name("Eu memo (:").build();
        Producer build2 = Producer.builder().name("Eu não memo (:").build();
        Producer build3 = Producer.builder().name("Eu memo ):").build();
        ProducerService.saveTransaction(List.of(build, build2, build3));
//
    }
}
