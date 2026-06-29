package ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonLazy {
    // Lazy Initialization
    private static AircraftSingletonLazy INSTANCE;

    private final Set<String> avaliableSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        avaliableSeats.add("1A");
        avaliableSeats.add("1B");
    }

    public static AircraftSingletonLazy getInstance(){
        if(INSTANCE == null){
            synchronized (AircraftSingletonLazy.class){
                if (INSTANCE == null){
                INSTANCE = new AircraftSingletonLazy("Boing 123");
                }
            }
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat){
        return avaliableSeats.remove(seat);
    }
}
