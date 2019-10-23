import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<Car>();

        Car car1 = new Car(Brand.Fiat, Type.Coupe, 1337, 10, 2);
        Car car2 = new Car(Brand.BMW, Type.Convertible, 1773, 8, 3);

        cars.add(car1);
        cars.add(car2);

        AutoPark autoPark = new AutoPark();

        List<Car> carBySpeed = autoPark.searchBySpeed(cars, 1336, 1338);

        System.out.println(autoPark.calculateCarsCoast(cars));

        autoPark.sortByEconomy(cars);

        for (Car auto : cars) {
            auto.showInfo();
        }

        for (Car auto : carBySpeed) {
            auto.showInfo();
        }
    }
}
