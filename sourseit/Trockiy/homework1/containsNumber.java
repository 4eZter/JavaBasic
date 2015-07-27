package org.sourseit.Trockiy.homework.first;

/**
 * Created by CheZter on 18.06.2015.
 */
public class containsNumber {
    public static void main(String[] args){
        int a = (int)(Math.random()*150+1)+5;

        System.out.println(a);

        if(a<=25||a>=100){
            System.out.println("случайно выбранное число не попало в интервал (25;100)");
        }else{
            System.out.println("случайно выбранное число попало в интервал (25;100)");
        }
    }
}
//Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155]
// целое число в интервал (25;100) и сообщать результат на экран.
