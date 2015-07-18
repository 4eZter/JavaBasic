package org3.sourseit.Trockiy.homework.third.controlSystem.entities;


import org3.sourseit.Trockiy.homework.third.controlSystem.properties.stateOfDriver;

public class Driver extends carStation{

    private String name;
    private stateOfDriver stateOfDriver;

    public Driver(){
    }

    public Driver(String name, stateOfDriver stateOfDriver){
        this.name = name;
        this.stateOfDriver = stateOfDriver;

    }

    @Override
    void getRepair() {
        super.getRepair();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public org3.sourseit.Trockiy.homework.third.controlSystem.properties.stateOfDriver getStateOfDriver(int number) {
        return stateOfDriver;
    }

    public void setStateOfDriver(org3.sourseit.Trockiy.homework.third.controlSystem.properties.stateOfDriver stateOfDriver) {
        this.stateOfDriver = stateOfDriver;
    }
}
