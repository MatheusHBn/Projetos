package ZZHpadroesdeprojeto.test;

import ZZHpadroesdeprojeto.dominio.AircraftSingletonEnum;

public class AircraftSingletonEnumTest01 {
    /*
    Um jeito de evitar o Reflection, é com Enum's, dessa forma, não tem como você acessar um construtor, porque não tem.

    Mas como nada é tão perfeito assim, você não poder usar Enum's em toda ocasião, pois tem vezes que (por exemplo) seu Singleton
    precisa receber um parâmetro, e um enum não permite passar esses parâmetros dessa forma.
     */
    static void main() {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
