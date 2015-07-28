package org.sourseit.Trockiy.homework.first;

import java.util.Scanner;

/**
 * Created by CheZter on 18.06.2015.
 */
public class sumOfNumbers {
    public static void main(String[] args){

        int a = 0;
        int b = 0;

        Scanner scn=new Scanner(System.in);
        if(scn.hasNextInt()){
            a=scn.nextInt();

            while(a!=0){
                b = b + (a % 10);
                a = a / 10;
            }

            System.out.println("сумма всех чисел  =  "+b);
        }
        else System.out.println("этот символ не является числом");
    }
}
//В переменной n хранится натуральное двузначное число. Создайте программу,
//вычисляющую и выводящую на экран сумму цифр числа n(n – вводит пользователь).