package ZZBcomportamento.test;

import ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    static void main() {
        System.out.println(filterGreenCar(carList));
        System.out.println(filteByColor(carList, "Blue"));
        System.out.println(filteByAgeBefore(carList, 2016));

    }

    private static List<Car> carList = List.of(
            new Car("Blue", 2020),
            new Car("Red", 2006),
            new Car("Purple", 2026),
            new Car("Green", 2014));

    private static List<Car> filterGreenCar(List<Car> carList) {
        List<Car> greenCar = new ArrayList<>();
        for (Car car : carList) {
            if (car.getColor().equals("green") || car.getColor().equals("Green")) {
                greenCar.add(car);
            }
        }
        return greenCar;
    }

    private static List<Car> filteByColor(List<Car> carList, String color) {
        List<Car> filterByColor = new ArrayList<>();
        for (Car car : carList) {
            if (car.getColor().equals(color)) {
                filterByColor.add(car);
            }
        }
        return filterByColor;
    }

    private static List<Car> filteByAgeBefore(List<Car> carList, int age) {
        List<Car> filterByAgeBefore = new ArrayList<>();
        for (Car car : carList) {
            if (car.getYear() < age) {
                filterByAgeBefore.add(car);
            }
        }
        return filterByAgeBefore;
    }
}
