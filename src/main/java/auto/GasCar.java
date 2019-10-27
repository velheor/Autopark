package auto;

import autoCriteria.Brand;
import autoCriteria.FuelType;
import autoCriteria.Type;

public class GasCar extends Car {
    private long fuelConsumption;
    private FuelType fuelType;

    public GasCar(Brand brand, Type type, long maxSpeed, long price, FuelType fuelType, long fuelConsumption) {
        super(brand, type, maxSpeed, price);
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
    }

    public long getFuelConsumption() {
        return fuelConsumption;
    }

    public void showInfoGasCar() {
        System.out.println(showInfo() + ", " + "FuelType: "+ this.fuelType + ", "+"FuelConsumption" + this.fuelConsumption);
    }
}
