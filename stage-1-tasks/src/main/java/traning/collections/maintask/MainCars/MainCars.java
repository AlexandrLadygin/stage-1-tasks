package traning.collections.maintask.MainCars;

import traning.collections.maintask.Car.AbstractCar;
import traning.collections.maintask.Car.PassengerCar;
import traning.collections.maintask.Car.TruckCar;
import traning.collections.maintask.Models.PassengerCarBodies.Body;
import traning.collections.maintask.Models.PassengerType;
import traning.collections.maintask.Models.TruckType;
import traning.collections.maintask.Park.Park;

import java.util.Arrays;
import java.util.List;

public class MainCars {

    static List<AbstractCar> cars = Arrays.asList(
            new PassengerCar(9000, 7, 180, PassengerType.RENAULT_LOGAN, 4, Body.SEDAN),
            new PassengerCar(15000, 6, 200, PassengerType.TOYOTA_COROLLA, 4, Body.SEDAN),
            new PassengerCar(17000, 9, 150, PassengerType.VOLKSWAGEN_SHARAN, 7, Body.MINIVAN),
            new PassengerCar(20000, 12, 130, PassengerType.MERSEDEC_SPRINTER, 20, Body.MINIBUS),
            new PassengerCar(19500, 13, 120, PassengerType.RENAULT_TRAFIC, 8, Body.MINIVAN),
            new PassengerCar(21000, 14,135, PassengerType.PEUGEOT_BOXER, 18, Body.MINIBUS),
            new PassengerCar(14000, 5, 170, PassengerType.VOLKSWAGEN_GOLF, 4, Body.HATCHBACK),
            new TruckCar(30000, 25, 95, TruckType.ZIL, 8000, 6),
            new TruckCar(25000, 17, 90, TruckType.GAZ, 2500, 2),
            new TruckCar(40000, 33, 80, TruckType.URAL, 13500, 7),
            new TruckCar (41000, 40, 90, TruckType.KAMAZ, 14000, 8),
            new TruckCar(26000, 20, 99, TruckType.FAW, 5000, 14)

    );

    public static void main(String[] args) {

        Park park = new Park();

        park.calculateTotalCarsCost(cars);
        park.sortCarsByFuelConsumption(cars);
        park.findCarsBySpeedDiapason(cars, 170, 190);
    }
}
