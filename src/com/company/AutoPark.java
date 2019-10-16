package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AutoPark {

    public float CalculateCarsCoast(ArrayList<Auto> cars){
        float sum = 0;
        for(Auto auto:cars){
            sum = sum + auto.getPrice();
        }
        return sum;
    }

    public ArrayList<Auto> SortByEconomy(ArrayList<Auto> cars){
        Collections.sort(cars, Comparator.comparing(Auto::getFuelConsumption));
        return cars;
    }

    public ArrayList<Auto> searchBySpeed(ArrayList<Auto> cars, float min, float max){
        ArrayList<Auto> carSelection = new ArrayList<Auto>();
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
