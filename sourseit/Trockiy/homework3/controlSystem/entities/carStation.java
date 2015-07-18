package org3.sourseit.Trockiy.homework.third.controlSystem.entities;

import java.util.Random;

public class carStation {

    void getRepair(){
        Car car = new Car();
        car.setState(100);
    }

    public void Tour(){
        Car car = new Car();
        Driver driver = new Driver();
        Tour tour = new Tour();

        System.out.println(
                "Водитель " + driver.getName() +
                " выехал на машине " + car.getModel() + car.getTypeOfCars() + " типа" +
                " по маршруту " + tour.getRoot() +
                " протяженностью " + tour.getRootLength() + "км");


        Random random = new Random();
        int number = random.nextInt(3+1);

        System.out.println("Состояние водителя по окончанию маршрута: " + driver.getStateOfDriver(number));

        int i = car.getState();
        car.setState(i - 10);

        System.out.println("Состояние автомобиля по окончанию маршрута: " + car.getState());

    }
}
