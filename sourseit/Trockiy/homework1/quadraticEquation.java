package org.sourseit.Trockiy.homework.first;

import java.util.Scanner;

/**
 * Created by CheZter on 18.06.2015.
 */
public class quadraticEquation {
    public static void main(String[] args) {

        System.out.println("Пожалуйста, введите 3 вещественных числа");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double x1;
        double x2;

        double d = b*b - 4*a*c;

        if(d>0){
            double f = -b + Math.sqrt(d);
            double g = -b - Math.sqrt(d);
            x1 = f/(2*a);
            x2 = g/(2*a);
            System.out.println("two roots");
            System.out.println("homework1 root = " + x1);
            System.out.println("homework2 root = " + x2);
        }else if(d == 0){
            x1 = -b/(2*a);
            System.out.println("one root");
            System.out.println("the root is = " + x1);
        }else if(d<0){
            System.out.println("there is no roots");
        }

    }
}
//В три переменные a, b и c записаны три вещественных числа.
//Создать программу, которая будет находить и выводить на экран
//вещественные корни квадратного уравнения ax^2+bx+c=0, либо сообщать,
//что корней нет(a, b и c – вводит пользователь).