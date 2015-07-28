package org3.sourseit.Trockiy.homework.homework3.controlSystem.entities;

public class Tour {

    private String root;
    private int rootLength;

    public Tour(String root, int rootLength){
        this.root = root;
        this.rootLength = rootLength;
    }

    //pick Tour
    public static void setTours(int t){

        switch (t){
            case 1:
                autoBase.memoryTour = autoBase.Tour1;
                break;
            case 2:
                autoBase.memoryTour = autoBase.Tour2;
                break;
            case 3:
                autoBase.memoryTour = autoBase.Tour3;
                break;
            case 4:
                autoBase.memoryTour = autoBase.Tour4;
                break;
        }
    }

    public String getRoot() {
        return root;
    }
    public int getRootLength() {
        return rootLength;
    }


    //report
    @Override
    public String toString() {
        return "Выбранное направление:" + " " + getRoot() + " " + "расстояние:" + " " + getRootLength() + "km";
    }
}
