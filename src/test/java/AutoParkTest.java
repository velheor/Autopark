import auto.Car;
import auto.ElectricCar;
import auto.GasCar;
import autoCriteria.Brand;
import autoCriteria.FuelType;
import autoCriteria.Type;
import autoPark.AutoPark;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.deepEquals;
import static org.junit.Assert.assertEquals;

public class AutoParkTest {
    @Parameterized.Parameter
    AutoPark autoPark = new AutoPark();

    GasCar gasCar1 = new GasCar(Brand.Citroen,Type.Convertible,228, 1, FuelType.Petrol, 10);
    ElectricCar electricCar1 = new ElectricCar(Brand.Audi, Type.Hatchback, 1336, 2,10,15);
    GasCar gasCar2 = new GasCar(Brand.Bentley,Type.Sedun,47, 3, FuelType.Diesel, 15);
    ElectricCar electricCar2 = new ElectricCar(Brand.Geely, Type.Van, 33, 5,6,100);

    public void setUp() {
        autoPark.addAutoParkCar(gasCar1);
        autoPark.addAutoParkCar(gasCar2);
        autoPark.addAutoParkCar(electricCar1);
        autoPark.addAutoParkCar(electricCar2);
    }

    @Test
    public void calculateCarsCoast() {
        setUp();
        long actual = autoPark.calculateCarsCoast();
        long expected = 11;
        assertEquals(expected, actual, 0.00000001);
    }

    @Test
    public void sortByFuelConsumption(){
        List<GasCar> actual = autoPark.sortByFuelConsumption();
        List<GasCar> expected = new ArrayList<GasCar>();
        expected.add(gasCar1);
        expected.add(gasCar2);
        deepEquals(actual, expected);
    }

    @Test
    public void sortByLifeTimeBattery(){
        List<ElectricCar> actual = autoPark.sortLifeTimeBattery();
        List<ElectricCar> expected = new ArrayList<ElectricCar>();
        expected.add(electricCar1);
        expected.add(electricCar2);
        deepEquals(actual, expected);
    }

    @Test
    public void searchBySpeed() {
        setUp();
        List<Car> actual = autoPark.searchBySpeed(46, 48);
        List<Car> expected = new ArrayList<Car>();
        expected.add(gasCar2);
        deepEquals(actual, expected);
    }
}