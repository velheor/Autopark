
public class Car {
    private Brand brand;
    private Type type;
    private float maxSpeed;
    private float fuelConsumption;
    private float price;

    public Car(Brand brand, Type type, float maxSpeed, float fuelConsumption, float price) {
        this.brand = brand;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void showInfo() {
        System.out.println(this.brand + ", " + this.type + ", " + this.maxSpeed + ", " + this.fuelConsumption + ", " + this.price);
    }
}


