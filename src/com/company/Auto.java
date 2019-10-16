package com.company;


public class Auto implements Info {

    private Kinds kinds;
    private Type type;
    private float maxSpeed;
    private float fuelConsumption;
    private float price;

    public Auto(Kinds kinds, Type type, float maxSpeed, float fuelConsumption, float price){
        this.kinds = kinds;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
    }

    public float getPrice(){
        return price;
    }

    public float getFuelConsumption(){
        return fuelConsumption;
    }

    public float getMaxSpeed(){
        return maxSpeed;
    }

    @Override
    public void showInfo(){
        System.out.println(this.kinds + ", " + this.type + ", " + this.maxSpeed + ", " + this.fuelConsumption + ", " + this.price);
}

}

