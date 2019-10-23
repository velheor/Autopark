import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AutoParkTest {

    @Parameterized.Parameter
    AutoPark autoPark = new AutoPark();

    List<Car> cars = new ArrayList<Car>();
    Car car1 = new Car(Brand.Audi, Type.Coupe, 210, 10, 2);
    Car car2 = new Car(Brand.BMW, Type.Convertible, 1, 8, 3);

    @Test
    public void calculateCarsCoast() {
        cars.add(car1);
        cars.add(car2);

        float actual = autoPark.calculateCarsCoast(cars);
        float expected = 5;

        assertEquals(0, Float.compare(actual, expected));
    }

    @Test
    public void sortByEconomy() {

        cars.add(car1);
        cars.add(car2);
        List<Car> actual = autoPark.sortByEconomy(cars);
        List<Car> expected = new ArrayList<Car>();
        expected.add(car2);
        expected.add(car1);

        assertEquals(actual, expected);
    }

    @Test
    public void searchBySpeed() {

        cars.add(car1);
        cars.add(car2);

        List<Car> actual = autoPark.searchBySpeed(cars, 201, 225);
        List<Car> expected = new ArrayList<Car>();
        expected.add(car1);

        assertEquals(actual, expected);
    }
}