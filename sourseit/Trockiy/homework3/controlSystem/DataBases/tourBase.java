package org3.sourseit.Trockiy.homework.third.controlSystem.DataBases;

import org3.sourseit.Trockiy.homework.third.controlSystem.entities.Tour;

public class tourBase {

    Tour[] tours = new Tour[]{
            new Tour("London", 500),
            new Tour("Paris", 450),
            new Tour("Stokholm", 300),
            new Tour("Berlin", 700)
    };

    public Tour[] getTours() {
        return tours;
    }

    public void setTours(Tour[] tours) {
        this.tours = tours;
    }
}
