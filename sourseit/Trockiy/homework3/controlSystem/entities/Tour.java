package org3.sourseit.Trockiy.homework.third.controlSystem.entities;

public class Tour {

    private String root;
    private int rootLength;

    public Tour(){
    }

    public Tour(String root, int rootLength){
        this.root = root;
        this.rootLength = rootLength;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public int getRootLength() {
        return rootLength;
    }

    public void setRootLength(int rootLength) {
        this.rootLength = rootLength;
    }
}
