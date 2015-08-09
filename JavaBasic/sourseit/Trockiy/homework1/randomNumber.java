package org.sourseit.Trockiy.homework.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by CheZter on 18.06.2015.
 */
public class randomNumber {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите ваше число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);

        System.out.println( (int)(Math.random()*(2*n+1)) - n );

    }
}
//Натуральное положительное число записано в переменную n. Создайте программу,
//которая будет генерировать и выводить на экран целое псевдослучайное
//число из отрезка [-n;n] (n – вводит пользователь).