import auto.Car;
import auto.ElectricCar;
import auto.GasCar;
import autoCriteria.Brand;
import autoCriteria.FuelType;
import autoCriteria.Type;
import autoPark.AutoPark;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.deepEquals;
import static org.junit.Assert.assertEquals;

public class AutoParkTest {
    static AutoPark autoPark = new AutoPark();
    static GasCar gasCar1;
    static GasCar gasCar2;
    static ElectricCar electricCar1;
    static ElectricCar electricCar2;

    @BeforeClass
    public static void setUp() {
        gasCar1 = new GasCar(Brand.Citroen, Type.Convertible, 228, 1, FuelType.Petrol, 10);
        electricCar1 = new ElectricCar(Brand.Audi, Type.Hatchback, 1336, 2, 10, 15);
        gasCar2 = new GasCar(Brand.Bentley, Type.Sedun, 47, 3, FuelType.Diesel, 15);
        electricCar2 = new ElectricCar(Brand.Geely, Type.Van, 33, 5, 6, 100);

        autoPark.addAutoParkCar(gasCar1);
        autoPark.addAutoParkCar(gasCar2);
        autoPark.addAutoParkCar(electricCar1);
        autoPark.addAutoParkCar(electricCar2);
    }

    @Test
    public void calculateCarsCoast() {
        long actual = autoPark.calculateCarsCoast();
        long expected = 11;
        assertEquals(expected, actual, 0.00000001);
    }

    @Test
    public void sortByFuelConsumption() {
        List<GasCar> actual = autoPark.sortByFuelConsumption();
        List<GasCar> expected = new ArrayList<GasCar>();
        expected.add(gasCar1);
        expected.add(gasCar2);
        deepEquals(actual, expected);
    }

    @Test
    public void sortByLifeTimeBattery() {
        List<ElectricCar> actual = autoPark.sortLifeTimeBattery();
        List<ElectricCar> expected = new ArrayList<ElectricCar>();
        expected.add(electricCar1);
        expected.add(electricCar2);
        deepEquals(actual, expected);
    }

    @Test
    public void searchBySpeed() {
        List<Car> actual = autoPark.searchBySpeed(46, 48);
        List<Car> expected = new ArrayList<Car>();
        expected.add(gasCar2);
        deepEquals(actual, expected);
    }
}