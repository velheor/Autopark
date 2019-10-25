package logic;

import auto.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;


public class AutoPark {
    private static final Logger LOGGER = Logger.getLogger(AutoPark.class.getSimpleName());
    private List<Car> cars = new ArrayList<Car>();

    public List<Car> getList() {
        return cars;
    }

    public void addCar(Car car) {
        this.cars.add(car);
        LOGGER.info("Car added");
    }

    public float calculateCarsCoast() {
        float sum = 0;
        for (Car car : cars) {
            sum = sum + car.getPrice();
        }
        LOGGER.info("Calculated autopark price");
        return sum;
    }

    public List<Car> sortByEconomy() {
        List<Car> sortedCards = new ArrayList<>(this.cars);
        Collections.sort(sortedCards, Comparator.comparing(Car::getFuelConsumption));
        return sortedCards;
    }

    public List<Car> searchBySpeed(float min, float max) {
        List<Car> carSelection = new ArrayList<Car>();
        for (Car car : cars) {
            if (car.getMaxSpeed() >= min && car.getMaxSpeed() <= max) {
                carSelection.add(car);
            }
        }
        return carSelection;
    }
}