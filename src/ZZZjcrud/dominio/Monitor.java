package ZZZjcrud.dominio;

import lombok.Builder;
import lombok.Value;


@Builder
@Value
public class Monitor {
    Integer id;
    String name;
    int hz;
    Producer producer;
}
