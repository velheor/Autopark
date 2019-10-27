package auto;

import autoCriteria.Brand;
import autoCriteria.Type;

public class ElectricCar extends Car {
    private long lifeTimeBattery;
    private long chargingTime;

    public ElectricCar(Brand brand, Type type, long maxSpeed, long price, long lifeTimeBattery, long chargingTime) {
        super(brand, type, maxSpeed, price);
        this.lifeTimeBattery = lifeTimeBattery;
        this.chargingTime = chargingTime;
    }

    public long getLifeTimeBattery() {
        return lifeTimeBattery;
    }

    public void showInfoElectricCar() {
        System.out.println(showInfo() + ", " + "LifeTimeBattery: "+ this.lifeTimeBattery + ", "+"ChargingTime: " + this.chargingTime);
    }
}
