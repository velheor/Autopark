package autoPark;

import auto.Car;
import auto.ElectricCar;
import auto.GasCar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class AutoPark {
    private static final Logger logger = LogManager.getLogger(AutoPark.class);
    private List<Car> autoPark = new ArrayList<Car>();
    private List<GasCar> gasCars = new ArrayList<GasCar>();
    private List<ElectricCar> electricCars = new ArrayList<ElectricCar>();

    public void addAutoParkCar(Car car){
        logger.info("Car added to autoPark");
        this.autoPark.add(car);
    }

    public void addGasCar(GasCar car) {
        logger.info("GasCar added");
        this.gasCars.add(car);
    }

    public void addElectricCar(ElectricCar car) {
        logger.info("ElectricCar added");
        this.electricCars.add(car);
    }

    public long calculateCarsCoast() {
        logger.info("Calculated autopark price");
        long sum = 0;
        for (Car car : autoPark) {
            sum = sum + car.getPrice();
        }
        return sum;
    }

    public List<GasCar> sortByFuelConsumption() {
        logger.info("Sorted by FuelConsumption");
        List<GasCar> sortedCards = new ArrayList<>(this.gasCars);
        Collections.sort(sortedCards, Comparator.comparing(GasCar::getFuelConsumption));
        return sortedCards;
    }

    public List<ElectricCar> sortLifeTimeBattery() {
        logger.info("Sorted by lifeTimeBattery");
        List<ElectricCar> sortedCards = new ArrayList<>(this.electricCars);
        Collections.sort(sortedCards, Comparator.comparing(ElectricCar::getLifeTimeBattery));
        return sortedCards;
    }

    public List<Car> searchBySpeed(float min, float max) {
        logger.info("Sorted by speed selection");
        List<Car> carSelection = new ArrayList<Car>();
        for (Car car : autoPark) {
            if (car.getMaxSpeed() >= min && car.getMaxSpeed() <= max) {
                carSelection.add(car);
            }
        }
        return carSelection;
    }
}