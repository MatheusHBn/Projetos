package Rdatas.test;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    /*
    ZoneId, é um recurso do Java onde ele oferece zonas do mundo inteiro.
    Para ver qual a zona (quando eu falo zona, eu quero dizer região do mundo) padrão do sistema, é só utilizar:
    "ZoneId.SystemDefault", e para ver todas as zonas que o Java tem, é: "ZoneId.SHORTS_IDS"

    Para definir uma zone, é só usar o ZondeId.of("Continente/Cidade)". E ele é bastante útil, pois o LocalDateTime não
    te passa a zona, só passa o tempo e data, e é por isso que existe o ZonedDateTime, basta você adicionar um .atZone();
    na sua variável do LocalDateTime

    Ele é uma expansão do LocalDateTime, o ZonedDateTime pega às horas, datas e zonas. Importante lembrar que depois das
    horas, aparece o fuso horário + continente/cidade,

    E outra coisa mais interessante ainda, você também pode usar o Zone com o Instant, do mesmo jeito que no LocalDateTime,
    A diferença é, o Instant já deixa formatado,

    Um jeito para deixar o fuso horário mesmo não sabendo qual zona você está, é o OffsetDateTime, você só pode definir para
    - ou + 18, ele não mostra a cidade, funciona tanto com o LocalDateTime e Instant
     */
    static void main() {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println(zoneId);

        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = now.atZone(zoneId);
        System.out.println(zonedDateTime);

        Instant insantnow = Instant.now();
        ZonedDateTime zonedDateTime1 = insantnow.atZone(zoneId);
        System.out.println(zonedDateTime1);

        ZoneOffset zoneOffset = ZoneOffset.of("+12:00");
        OffsetDateTime offsetDateTime = now.atOffset(zoneOffset);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime1 = insantnow.atOffset(zoneOffset);
        System.out.println(offsetDateTime1);

    }
}
