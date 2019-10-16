package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Auto> cars = new ArrayList<Auto>();
        Auto car1 = new Auto(Kinds.Audi, Type.Gas, 1337, 10, 2);
        Auto car2 = new Auto(Kinds.BMW, Type.Gas, 1773, 8, 3);
        cars.add(car1);
        cars.add(car2);
        AutoPark autoPark = new AutoPark();
        System.out.println(autoPark.CalculateCarsCoast(cars));

        autoPark.SortByEconomy(cars);

        for(Auto auto:cars){
            outputInfo(auto);
        }

        ArrayList<Auto> carBySpeed = autoPark.searchBySpeed(cars, 1336, 1338);

        for(Auto auto :carBySpeed){
            outputInfo(auto);
        }
    }

    public static void outputInfo(Info info){
        info.showInfo();
    }
}
