package auto;

import autoCriteria.Brand;
import autoCriteria.Type;


public class Car {
    private Brand brand;
    private Type type;
    private long maxSpeed;
    private long price;

    public Car(Brand brand, Type type, long maxSpeed, long price) {
        this.brand = brand;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public long getPrice() {
        return price;
    }

    public long getMaxSpeed() {
        return maxSpeed;
    }

    public String showInfo() {
        return (this.brand + ", " + this.type + ", "+ "Max speed: " + this.maxSpeed + ", "+"Price: " + this.price);
    }
}


