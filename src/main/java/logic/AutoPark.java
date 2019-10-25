package logic;

import auto.Car;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class AutoPark {
    private List<Car> cars = new ArrayList<Car>();

    public List<Car> getList(){
        return cars;
    }

    public void addCar(Car car){
        this.cars.add(car);
    }

    public float calculateCarsCoast() {
        float sum = 0;
        for (Car car : cars) {
            sum = sum + car.getPrice();
        }
        return sum;
    }

    public List<Car> sortByEconomy() {
        Collections.sort(cars, Comparator.comparing(Car::getFuelConsumption));
        return cars;
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