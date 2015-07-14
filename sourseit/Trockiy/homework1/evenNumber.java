package org.sourseit.Trockiy.homework.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by CheZter on 15.06.2015.
 */
public class evenNumber {

    public void ifOdd(int n) {
        if ((n % 2) == 0) {
            System.out.println("число является четным");
        } else
            System.out.println("число является нечетным");
    }


    public static void main(String[] args) throws IOException {
        System.out.println("Пожалуйста, введите ваше число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num1 = reader.readLine();
        int n = Integer.parseInt(num1);
        evenNumber Number = new evenNumber();
        Number.ifOdd(n);
    }
}

//Создать программу, проверяющую и сообщающую на экран, является ли целое число,
//записанное в переменную n, чётным либо нечётным (n – вводит пользователь).