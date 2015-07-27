package org3.sourseit.Trockiy.homework.homework3.controlSystem;

import org3.sourseit.Trockiy.homework.homework3.controlSystem.entities.Car;
import org3.sourseit.Trockiy.homework.homework3.controlSystem.entities.Driver;
import org3.sourseit.Trockiy.homework.homework3.controlSystem.entities.Tour;
import org3.sourseit.Trockiy.homework.homework3.controlSystem.entities.autoBase;
import org3.sourseit.Trockiy.homework.homework3.controlSystem.util.Chooze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dispatcher {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Вас приветствует система управления автомобильными перевозками!");
        System.out.println("Желаете оформить заказ? [Y] or [N]");

        String yes = reader.readLine();

        if (Chooze.chooze(yes)) {
            Begin();

        } else {System.out.println("Удачного вам дня!");}

    }

    //Lets go!
    private static void Begin() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //drivers main set
        System.out.println("Список водителей: \n");
        autoBase.driversArray();

        System.out.println("Пожалуйста, выберите водителя из списка доступных");

        int d = Integer.parseInt(reader.readLine());

            Driver.setDrivers(d);
            Driver.randomDriverState();

        if (driverState()){
            Driver.setDrivers(d);

        }else System.out.println("Водитель выбран!");


        //cars main set
        System.out.println("Список автомобилей");
        autoBase.carsArray();

        System.out.println("Пожалуйста, выберите машину");

        int c = Integer.parseInt(reader.readLine());

        do{

        Car.setCar(c);

        }while (carState());



        //tours main set
        System.out.println("Список направлений");
        autoBase.toursArray();

        System.out.println("Пожалуйста, выберите направление");

        int t = Integer.parseInt(reader.readLine());

        Tour.setTours(t);

        autoBase.doTrip();
        autoBase.repair();
        System.out.println("Удачного вам дня!");
    }


    //car state check
    private static boolean carState() {
        int critical = 50;
        if(autoBase.memoryCar.getState()<critical){
            Driver.getRepair();
        }
        return false;
    }

    //driver state check
    private static boolean driverState() throws IOException {
        //if suspended
        if (autoBase.memoryDriver.getStateOfDriver().equals("Отстранен")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Водитель отстранен от работы. Вернуть его к исполнению обязанностей? [Y] or [N]");
            String yes = reader.readLine();
            if (Chooze.chooze(yes)) {
                if (!autoBase.memoryDriver.getStateOfDriver().equals("Отстранен")) {

                    System.out.println("Водитель восстановлен");
                    return true;

                } else if(autoBase.memoryDriver.getStateOfDriver().equals("Свободен")){
                    return true;
                }
            }else Begin();

        //if drunk
        } else if (autoBase.memoryDriver.getStateOfDriver().equals("Мертвецки пьян")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Водитель находится в неадекватном состоянии. Отстранить его от выполнения заказов? [Y] or [N]");
            String yes = reader.readLine();
            if (Chooze.chooze(yes)) {
                System.out.println("Водитель отстранен. Выберите другого водителя");
                Begin();
            }
        //if in tour
        } else if (autoBase.memoryDriver.getStateOfDriver().equals("Выполняет заказ")) {

            System.out.println("В данный момент водитель занят выполнением заказа. Выберите другого водителя");

            Begin();
        }
        return false;
    }
}