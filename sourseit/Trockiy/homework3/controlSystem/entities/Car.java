package org3.sourseit.Trockiy.homework.third.controlSystem.entities;

public class Car {

    private String model;
    private String typeOfCars;
    private int state;

    public Car(String model, String typeOfCars, int state){
        this.model = model;
        this.typeOfCars = typeOfCars;
        this.state = state;
    }

    public String getModel() {
        return model;
    }
    public String getTypeOfCars() {
        return typeOfCars;
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }

    // pick car
    public static void setCar(int c) {//pick your car

        switch (c) {

            case 1:
                autoBase.memoryCar = autoBase.Car1;
                break;
            case 2:
                autoBase.memoryCar = autoBase.Car2;
                break;
            case 3:
                autoBase.memoryCar = autoBase.Car3;
                break;
            case 4:
                autoBase.memoryCar = autoBase.Car4;
                break;
        }
    }

    //report
    @Override
    public String toString() {
        return "Автомобиль: " + " " + getModel() + " " + "тип: " + " " + getTypeOfCars() + " " + "состояние: " + " " + getState();
    }


}

