package org3.sourseit.Trockiy.homework.third.controlSystem.DataBases;

import org3.sourseit.Trockiy.homework.third.controlSystem.entities.Car;
import org3.sourseit.Trockiy.homework.third.controlSystem.properties.typeOfCars;

public class carBase {


    Car[] cars = new Car[]{
            new Car("MAN", typeOfCars.LORRY, 100),
            new Car("VOLVO", typeOfCars.LORRY, 70),
            new Car("MACK", typeOfCars.LORRY, 60),
            new Car("Mersedes", typeOfCars.PASSENGER, 100)
    };

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }
}


