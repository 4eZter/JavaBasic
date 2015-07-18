package org3.sourseit.Trockiy.homework.third.controlSystem.properties;

public enum stateOfDriver {

    INTOUR("в пути"), SUSPENDING("отстранен"), FREE("свободен"), DRUNK("пьян");

    private String state;

    stateOfDriver(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }


    @Override
    public String toString() {
        return this.state;
    }
}
