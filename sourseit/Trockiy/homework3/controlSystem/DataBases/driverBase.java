package org3.sourseit.Trockiy.homework.third.controlSystem.DataBases;

import org3.sourseit.Trockiy.homework.third.controlSystem.entities.Driver;
import org3.sourseit.Trockiy.homework.third.controlSystem.properties.stateOfDriver;

public class driverBase {

    Driver[] drivers = new Driver[]{
            new Driver("Stig", stateOfDriver.DRUNK),
            new Driver("Brian",stateOfDriver.FREE),
            new Driver("Richard",stateOfDriver.INTOUR),
            new Driver("Jeremy",stateOfDriver.SUSPENDING)
    };

    public Driver[] getDrivers() {
        return drivers;
    }

    public void setDrivers(Driver[] drivers) {
        this.drivers = drivers;
    }
}
