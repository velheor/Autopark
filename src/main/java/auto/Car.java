package auto;

import autoCriteria.Brand;
import autoCriteria.Type;

import java.util.logging.Logger;


public class Car {
    private Brand brand;
    private Type type;
    private long maxSpeed;
    private long fuelConsumption;
    private long price;

    private static final Logger LOGGER = Logger.getLogger(Car.class.getSimpleName());

    public Car(Brand brand, Type type, long maxSpeed, long fuelConsumption, long price) {
        this.brand = brand;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
    }

    public long getPrice() {
        return price;
    }

    public long getFuelConsumption() {
        return fuelConsumption;
    }

    public long getMaxSpeed() {
        return maxSpeed;
    }

    public void showInfo() {
        System.out.println(this.brand + ", " + this.type + ", " + this.maxSpeed + ", " + this.fuelConsumption + ", " + this.price);
    }
}


