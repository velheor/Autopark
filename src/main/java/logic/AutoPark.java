package logic;

import auto.Car;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class AutoPark {
    private static final Logger logger = LogManager.getLogger(AutoPark.class);
    private List<Car> cars = new ArrayList<Car>();

    public void addCar(Car car) {
        logger.info("Car added");
        this.cars.add(car);
    }

    public long calculateCarsCoast() {
        logger.info("Calculated autopark price");
        long sum = 0;
        for (Car car : cars) {
            sum = sum + car.getPrice();
        }
        return sum;
    }

    public List<Car> sortByEconomy() {
        logger.info("Sorted by economy");
        List<Car> sortedCards = new ArrayList<>(this.cars);
        Collections.sort(sortedCards, Comparator.comparing(Car::getFuelConsumption));
        return sortedCards;
    }

    public List<Car> searchBySpeed(float min, float max) {
        logger.info("Sorted by speed selection");
        List<Car> carSelection = new ArrayList<Car>();
        for (Car car : cars) {
            if (car.getMaxSpeed() >= min && car.getMaxSpeed() <= max) {
                carSelection.add(car);
            }
        }
        return carSelection;
    }
}