import auto.Car;
import autoCriteria.Brand;
import autoCriteria.Type;
import logic.AutoPark;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(Brand.Fiat, Type.Coupe, 1337, 10, 2);
        Car car2 = new Car(Brand.BMW, Type.Convertible, 1773, 8, 3);

        AutoPark autoPark = new AutoPark();

        autoPark.addCar(car1);
        autoPark.addCar(car2);

        List<Car> carBySpeed = autoPark.searchBySpeed(1336, 1338);

        System.out.println("Calculated autopark price");
        System.out.println(autoPark.calculateCarsCoast());

        autoPark.sortByEconomy();
        System.out.println("Sorted by economy");

        for (Car auto : autoPark.getList()) {
            auto.showInfo();
        }

        System.out.println("Found by speed");
        for (Car auto : carBySpeed) {
            auto.showInfo();
        }
    }

}
