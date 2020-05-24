/*
10. Таксопарк. Определить иерархию легковых автомобилей. Создать таксопарк.
Подсчитать стоимость автопарка.
Провести сортировку автомобилей парка по расходу топлива.
Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости.
*/

package traning.collections.maintask.Park;

import traning.collections.maintask.Car.AbstractCar;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Park {

    public void calculateTotalCarsCost(List<? extends AbstractCar> cars){
        int totalCarsCost = 0;
        for (AbstractCar car : cars) {
            totalCarsCost += car.getCost();
        }
        System.out.println("Total cars cost:" + "\n" + totalCarsCost);
    }

    public void sortCarsByFuelConsumption(List<? extends AbstractCar> cars){
        Collections.sort(cars, new Comparator<AbstractCar>() {
            public int compare(AbstractCar a, AbstractCar b) {
                return a.getFuelConsumption() - (b.getFuelConsumption());
            }
        });
        System.out.println("\nSorted by fuel consumption:");
        for ( AbstractCar car : cars )
            System.out.println(car);
    }

    public void findCarsBySpeedDiapason(List<? extends AbstractCar> cars, int minSpeed, int maxSpeed){
        System.out.println("\nCars with the right speed:");
        for (AbstractCar car : cars){
            if(car.getSpeed()> minSpeed && car.getSpeed()<maxSpeed){
                System.out.println(car);
            }
        }
    }
}


