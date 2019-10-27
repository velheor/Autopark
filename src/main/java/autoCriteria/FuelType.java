package autoCriteria;

public enum FuelType {
    Petrol("Petrol"),
    Diesel("Diesel");

    private String fuelType;

    FuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getString(String fuelType) {
        return fuelType;
    }
}
