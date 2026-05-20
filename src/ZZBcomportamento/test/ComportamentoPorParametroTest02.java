package ZZBcomportamento.test;

import ZZBcomportamento.dominio.Car;
import ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {

    static void main() {
    }
    List<Car> listGreenCar = filter(carList, car -> car.getColor().equals("Green"));
    List<Car> listBlueCar = filter(carList, car -> car.getColor().equals("Blue"));
    List<Car> listYearBefore = filter(carList, car -> car.getYear() < 2018);



    private static List<Car> carList = List.of(
            new Car("Blue", 2020),
            new Car("Red", 2006),
            new Car("Purple", 2026),
            new Car("Green", 2014));

    private static List<Car> filter (List<Car> carList, Predicate<Car> carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : filteredCar){
            if (carPredicate.test(car)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }


}
