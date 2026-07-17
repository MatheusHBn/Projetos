package ZZIjbdc.test;

import ZZIjbdc.dominio.Producer;
import ZZIjbdc.repository.ProducerRepositoryRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    static void main() {
        Producer producerToUpdate = Producer.builder().id(20).name("seila zzzzzz").build();
//        ProducerRepositoryRowSet.updateJdbcRowSet(producerToUpdate);
        ProducerRepositoryRowSet.updateCachedRowSet(producerToUpdate);
//        log.info("------------------");
//        List<Producer> producers = ProducerRepositoryRowSet.findByNameJdbc("");
    }
}
