import auto.Car;
import autoCriteria.Brand;
import autoCriteria.Type;
import logic.AutoPark;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(Brand.Fiat, Type.Coupe, 1337, 10, 2);
        Car car2 = new Car(Brand.BMW, Type.Convertible, 1773, 8, 3);
        Car car3 = new Car(Brand.Dodge, Type.Sedun, 1773, 1, 1);

        AutoPark autoPark = new AutoPark();

        autoPark.addCar(car1);
        autoPark.addCar(car3);
        autoPark.addCar(car2);

        System.out.println("Calculated autopark price");
        System.out.println(autoPark.calculateCarsCoast());


        System.out.println("Sorted by economy");
        for (Car auto : autoPark.sortByEconomy()) {
            auto.showInfo();
        }

        System.out.println("Found by speed");
        for (Car auto : autoPark.searchBySpeed(1336, 1338)) {
            auto.showInfo();
        }
    }

}
