package org3.sourseit.Trockiy.homework.third.controlSystem.entities;

import org3.sourseit.Trockiy.homework.third.controlSystem.properties.typeOfCars;

public class Car {

    private String model;
    private typeOfCars typeOfCars;
    private int state;


    public Car(){

    }

    public Car(String model, typeOfCars typeOfCars){
        this.model = model;
        this.typeOfCars = typeOfCars;
    }
    public Car(String model, typeOfCars typeOfCars, int state){
        this.model = model;
        this.typeOfCars = typeOfCars;
        this.state = state;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public org3.sourseit.Trockiy.homework.third.controlSystem.properties.typeOfCars getTypeOfCars() {
        return typeOfCars;
    }

    public void setTypeOfCars(org3.sourseit.Trockiy.homework.third.controlSystem.properties.typeOfCars typeOfCars) {
        this.typeOfCars = typeOfCars;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

}
