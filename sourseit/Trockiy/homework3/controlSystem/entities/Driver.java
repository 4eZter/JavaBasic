package org3.sourseit.Trockiy.homework.homework3.controlSystem.entities;

import java.util.Random;

public class Driver {

    private String Name;
    private String stateOfDriver;

    public Driver(String Name) {
        this.Name = Name;
    }

    public String getStateOfDriver() {
        return stateOfDriver;
    }
    public void setStateOfDriver(String stateOfDriver) {
        this.stateOfDriver = stateOfDriver;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public String getName() {
        return Name;
    }

    // pick driver
    public static void setDrivers(int d) {

        switch (d) {
            case 1:
                autoBase.memoryDriver = autoBase.First;
                break;
            case 2:
                autoBase.memoryDriver = autoBase.Second;
                break;
            case 3:
                autoBase.memoryDriver = autoBase.Third;
                break;
            case 4:
                autoBase.memoryDriver = autoBase.Fourth;
                break;
        }
    }

    //driver state
    public static void randomDriverState(){

    Random r = new Random();
    int random = r.nextInt(4);

    switch(random)

    {
        case 1:
            autoBase.memoryDriver.setStateOfDriver("Свободен");
            break;
        case 2:
            autoBase.memoryDriver.setStateOfDriver("Отстранен");
            break;
        case 3:
            autoBase.memoryDriver.setStateOfDriver("Выполняет заказ");
            break;
        case 4:
            autoBase.memoryDriver.setStateOfDriver("Мертвецки пьян");
            break;
        case 0:randomDriverState();
        }

    }

    // drivers car needs repair check
    // driver can call repair now!!
    public static void getRepair() {
        autoBase.repair();
    }

    //report
    @Override
    public String toString() {
        return "Водитель: " +" " + getName();
    }
}




