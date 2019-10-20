package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AutoPark {

    public float calculateCarsCoast(List<Auto> cars){
        float sum = 0;
        for(Auto auto:cars){
            sum = sum + auto.getPrice();
        }
        return sum;
    }

    public List<Auto> sortByEconomy(List<Auto> cars){
        Collections.sort(cars, Comparator.comparing(Auto::getFuelConsumption));
        return cars;
    }

    public List<Auto> searchBySpeed(List<Auto> cars, float min, float max){
        List<Auto> carSelection = new ArrayList<Auto>();
        for(Auto auto:cars)
        {
            if (auto.getMaxSpeed() >= min && auto.getMaxSpeed() <= max)
            {
                carSelection.add(auto);
            }
        }
        return carSelection;
    }
}