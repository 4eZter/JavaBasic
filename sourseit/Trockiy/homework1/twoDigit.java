package org.sourseit.Trockiy.homework.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by CheZter on 18.06.2015.
 */
public class twoDigit {
    public static void main(String[] arg) throws IOException {
        System.out.println("Пожалуйста, введите ваше число");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int num = Integer.parseInt(s);


        int sum = num % 10 + num/10;
        System.out.println("сумма чисел = " + sum);
    }
}
//Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
//(заранее не известно сколько цифр будет в числе).