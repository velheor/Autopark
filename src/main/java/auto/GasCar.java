package auto;

import autoCriteria.Brand;
import autoCriteria.FuelType;
import autoCriteria.Type;

public class GasCar extends Car {
    private long fuelConsumption;
    private FuelType fuelType;

    public GasCar(Brand brand, Type type, long maxSpeed, long price, FuelType fuelType, long fuelConsumption) {
        super(brand, type, maxSpeed, price);
    }

    public long getFuelConsumption() {
        return fuelConsumption;
    }
}
