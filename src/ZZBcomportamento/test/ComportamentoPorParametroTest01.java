package ZZBcomportamento.test;

import ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    /*
    Aqui é falado sobre como fazer uma programação limpa e como poupar código para ter o mesmo de um
    código 5x maior que esse.
    por exemplo, esse codigo é gigante, existe um metodo somente para filtrar verde, outros tipos
    de cores e a idade do carro. Tudo isso poderia ser encurtado para um único metodo
     */

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
