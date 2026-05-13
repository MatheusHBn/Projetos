package Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    static void main() {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime agoraDepoisDoisAnos = LocalDateTime.now().plusYears(2);
        LocalTime agora1 = LocalTime.now();
        LocalTime tempoMinutosSeteHoras = LocalTime.now().minusHours(7);
        Duration duration = Duration.between(agora, agoraDepoisDoisAnos);
        Duration duration2 = Duration.between(agora1, tempoMinutosSeteHoras);
        Duration duration3 = Duration.between(Instant.now(), Instant.now().plusSeconds(2000));
        Duration duration4 = Duration.ofHours(4);
        System.out.println(duration);
        System.out.println(duration2);
        System.out.println(duration3);
        System.out.println(duration4);

    }
}
