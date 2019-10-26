import auto.Car;
import autoCriteria.Brand;
import autoCriteria.Type;
import logic.AutoPark;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.deepEquals;
import static org.junit.Assert.assertEquals;

public class AutoParkTest {
    @Parameterized.Parameter
    AutoPark autoPark = new AutoPark();
    Car car1 = new Car(Brand.Audi, Type.Coupe, 210, 10, 2);
    Car car2 = new Car(Brand.BMW, Type.Convertible, 1, 8, 3);

    public void setUp() {
        autoPark.addCar(car1);
        autoPark.addCar(car2);
    }

    @Test
    public void calculateCarsCoast() {
        setUp();
        long actual = autoPark.calculateCarsCoast();
        long expected = 5;
        assertEquals(5, actual, 0.00000001);
    }

    @Test
    public void sortByEconomy() {
        setUp();
        List<Car> actual = autoPark.sortByEconomy();
        List<Car> expected = new ArrayList<Car>();
        expected.add(car2);
        expected.add(car1);
        deepEquals(actual, expected);
    }

    @Test
    public void searchBySpeed() {
        setUp();
        List<Car> actual = autoPark.searchBySpeed(201, 225);
        List<Car> expected = new ArrayList<Car>();
        expected.add(car1);
        deepEquals(actual, expected);
    }
}