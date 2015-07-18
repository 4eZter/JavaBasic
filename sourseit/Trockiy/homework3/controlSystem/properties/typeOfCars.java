package org3.sourseit.Trockiy.homework.third.controlSystem.properties;

public enum typeOfCars {

    PASSENGER("Пассажирский"), LORRY("Грузовой");

    private String type;

    typeOfCars(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
