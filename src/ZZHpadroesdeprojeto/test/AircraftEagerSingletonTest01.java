package ZZHpadroesdeprojeto.test;

import ZZHpadroesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftEagerSingletonTest01 {
    /*
    Aqui vemos como é o uso do Eager de uma maneira melhor
     */
    static void main() {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getInstance();
        System.out.println(aircraftSingletonEager.bookSeat(seat));
    }
}
