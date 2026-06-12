package ZZBcomportamento.test;

import ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    /*
    Esse é um código que filtra qualquer carro, barco etc
     */

     // basicamente isso foi pra mostrar que independente de qualquer parametro que for passado,
     // o código vai funcionar normal, contendo a cor e ano do carro e suas especificaçõe
    static void main() {
        List<Car> listGreenCar = filter(carList, car -> car.getColor().equals("Green"));
        List<Car> listBlueCar = filter(carList, car -> car.getColor().equals("Blue"));
        List<Car> listYearBefore = filter(carList, car -> car.getYear() < 2018);
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    private static List<Car> carList = List.of(
            new Car("Blue", 2020),
            new Car("Red", 2006),
            new Car("Purple", 2026),
            new Car("Green", 2014));

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T List : list){
            if (predicate.test(List)){
                filteredList.add(List);
            }
        }
        return filteredList;
    }

}
