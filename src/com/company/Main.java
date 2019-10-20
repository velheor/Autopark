package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Auto> cars = new ArrayList<Auto>();
        Auto car1 = new Auto(Brand.Audi,Type.Gas, 1337, 10, 2);
        Auto car2 = new Auto(Brand.BMW, Type.Gas, 1773, 8, 3);
        cars.add(car1);
        cars.add(car2);
        AutoPark autoPark = new AutoPark();
        List<Auto> carBySpeed = autoPark.searchBySpeed(cars, 1336, 1338);
        System.out.println(autoPark.calculateCarsCoast(cars));

        autoPark.sortByEconomy(cars);

        for(Auto auto:cars){
            auto.showInfo();
        }

        for(Auto auto :carBySpeed){
            auto.showInfo();
        }
    }
}
