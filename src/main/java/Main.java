import auto.Car;
import auto.ElectricCar;
import auto.GasCar;
import autoCriteria.Brand;
import autoCriteria.FuelType;
import autoCriteria.Type;
import autoPark.AutoPark;

public class Main {
    public static void main(String[] args) {
        GasCar gasCar1 = new GasCar(Brand.Citroen, Type.Convertible, 228, 1, FuelType.Petrol, 10);
        ElectricCar electricCar1 = new ElectricCar(Brand.Audi, Type.Hatchback, 1336, 2, 10, 15);
        GasCar gasCar2 = new GasCar(Brand.Bentley, Type.Sedun, 47, 3, FuelType.Diesel, 15);
        ElectricCar electricCar2 = new ElectricCar(Brand.Geely, Type.Van, 33, 5, 6, 100);

        AutoPark autoPark = new AutoPark();

        autoPark.addAutoParkCar(gasCar1);
        autoPark.addAutoParkCar(gasCar2);

        autoPark.addAutoParkCar(electricCar1);
        autoPark.addAutoParkCar(electricCar2);

        autoPark.addGasCar(gasCar1);
        autoPark.addGasCar(gasCar2);

        autoPark.addElectricCar(electricCar1);
        autoPark.addElectricCar(electricCar2);

        System.out.println(autoPark.calculateCarsCoast());

        for (GasCar auto : autoPark.sortByFuelConsumption()) {
            auto.showInfoGasCar();
        }

        for (ElectricCar auto : autoPark.sortLifeTimeBattery()) {
            auto.showInfoElectricCar();
        }

        for (Car auto : autoPark.searchBySpeed(1335, 1338)) {
            if(auto instanceof GasCar){
                ((GasCar) auto).showInfoGasCar();
            } else{
                ((ElectricCar) auto).showInfoElectricCar();
            }
            auto.showInfo();
        }
    }
}
