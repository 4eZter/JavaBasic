package org.sourseit.Trockiy.homework.first;

/**
 * Created by CheZter on 15.06.2015.
 */
public class Dog {
    String name;
    String says;

    public static void main(String[] args){
    Dog dog1 = new Dog();
        dog1.name = "Spot";
        dog1.says = "Ruff!";

    Dog dog2 = new Dog();
        dog2.name = "Scruffy";
        dog2.says = "Wurf";

        System.out.println("Dog 1 name is = " + dog1.name);
        System.out.println("He says = " + dog1.says);
        System.out.println("Dog 2 name is = " + dog2.name);
        System.out.println("He says = " + dog2.says);
    }

}
//Создать класс Dog, который будет содержать 2 поля name и says. 
//В main( ) создать 2 экземпляра класса с name “spot” (says, “Ruff!”)
// и “scruffy” (says, “Wurf!”). И распечатать поля объектов.