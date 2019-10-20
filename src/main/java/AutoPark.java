import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AutoPark {

    public float calculateCarsCoast(List<Car> cars){
        float sum = 0;
        for(Car car:cars){
            sum = sum + car.getPrice();
        }
        return sum;
    }

    public List<Car> sortByEconomy(List<Car> cars){
        Collections.sort(cars, Comparator.comparing(Car::getFuelConsumption));
        return cars;
    }

    public List<Car> searchBySpeed(List<Car> cars, float min, float max){
        List<Car> carSelection = new ArrayList<Car>();
        for(Car car:cars)
        {
            if (car.getMaxSpeed() >= min && car.getMaxSpeed() <= max)
            {
                carSelection.add(car);
            }
        }
        return carSelection;
    }
}