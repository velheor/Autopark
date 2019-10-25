package autoCriteria;

public enum Brand {
    Audi("Audi"),
    Bentley("Bentley"),
    BMW("BMW"),
    Citroen("Citroen"),
    Dodge("Dodge"),
    Fiat("Fiat"),
    Ford("Ford"),
    Geely("Geely"),
    Honda("Honda"),
    Volkswagen("Volkswagen"),
    Volvo("Volvo");

    private String brand;

    Brand(String brand) {
        this.brand = brand;
    }

    public String getString(String brand) {
        return brand;
    }
}
