package org3.sourseit.Trockiy.homework.homework3.controlSystem.entities;

public class autoBase {

    protected static Driver First = new Driver("1. Stig");
    protected static Driver Second = new Driver("2. Jeremy");
    protected static Driver Third = new Driver("3. James");
    protected static Driver Fourth = new Driver("4. Richard");
    public static Driver memoryDriver;

    //Drivers list
    public static void driversArray(){
        Driver drivers[]={First, Second, Third, Fourth};
        for (Driver list : drivers){
            System.out.println(list);
        }
    }


    protected static Car Car1 = new Car("1. MAN","Грузовой",40);
    protected static Car Car2 = new Car("2. VOLVO","Грузовой",70);
    protected static Car Car3 = new Car("3. MACK","Грузовой",50);
    protected static Car Car4 = new Car("4. Mercedes","Легковой", 100);
    public static Car memoryCar;

    //Cars list
    public static void carsArray(){
        Car cars[]={Car1, Car2, Car3, Car4};
        for (Car list : cars){
            System.out.println(list);
        }
    }


    protected static Tour Tour1 = new Tour("1. London", 500);
    protected static Tour Tour2 = new Tour("2. Paris", 450);
    protected static Tour Tour3 = new Tour("3. Stockholm", 300);
    protected static Tour Tour4 = new Tour("4. Berlin", 700);
    protected static Tour memoryTour;

    //Tours list
    public static void toursArray(){
        Tour tours[]={Tour1, Tour2, Tour3, Tour4};
        for (Tour list : tours){
            System.out.println(list);
        }
    }

    public static void doTrip() {
        System.out.println("Ваш заказ сформирован!");
        System.out.println("Водитель: " + " " + autoBase.memoryDriver.getName() + " " + "совершил поездку" + " " + "на автомобиле: " + autoBase.memoryCar.getModel() + " " + "по направлению в: " + " " + autoBase.memoryTour.getRoot() + " " + "протяженностью" + " " + autoBase.memoryTour.getRootLength() + "km");
        autoBase.memoryCar.setState(autoBase.memoryCar.getState() - 10);

        System.out.println("Состояние автомобиля на данный момент: " + autoBase.memoryCar.getState());

    }

    public static void repair(){
        System.out.println("Автомобиль вышел из строя! Водитель произвел экстренный запрос на ремонт");
        int i = 100;
        System.out.println("Ремонт автомобиля успешно завершен");
        autoBase.memoryCar.setState(i);

        System.out.println("Состояние автомобиля после ремонта: " + autoBase.memoryCar.getState());
    }
}
