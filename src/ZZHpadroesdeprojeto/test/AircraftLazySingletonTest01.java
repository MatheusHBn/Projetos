package ZZHpadroesdeprojeto.test;

import ZZHpadroesdeprojeto.dominio.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftLazySingletonTest01 {
    /*
    Agora uma variante do Singleton é o Lazy Initialization, tem o "Lazy" porque o programa é "preguiçoso" e adia a criação
    do objeto até o último momento possível, por isso tem o if(INSTANCE == null), pois ele verifica se já tem um objeto,
    se não tem, ele vê que ninguem pediu o objeto, então nada acontece, mas depois que alguém faz, a INSTANCE != null,
    então ele retorna o objeto

    A gambiarra que você está vendo ai embaixo mostra que o Singleton é quebrável, usando Reflection. Reflection é uma
    API do Java que permite inspecionar e manipular classes em tempo de execução, e você consegue descobrir metodos,
    atributos, construtores, etc. E ali embaixo, resumidamente, faz o construtor sair de private para public, permitindo
    você criar outro objeto e driblar o Singleton.

    Mas é claro que existem técnicas que evitam isso, mas veremos isso mais pra frente.
    ( e detalhe, o Reflection funciona no Eager e Lazy Initialization)
     */

    static void main() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftSingletonLazy.getInstance());
        Constructor<AircraftSingletonLazy> declaredConstructor = AircraftSingletonLazy.class.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        AircraftSingletonLazy aircraftSingletonLazy = declaredConstructor.newInstance("Boing 123");
        System.out.println(aircraftSingletonLazy);
    }

    private static void bookSeat(String seat){
        AircraftSingletonLazy aircraft = AircraftSingletonLazy.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}
