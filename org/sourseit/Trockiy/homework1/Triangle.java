package org.sourseit.Trockiy.homework.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by CheZter on 16.06.2015.
 */
public class Triangle {
    public static void main(String[] args) throws IOException {

        System.out.println("введите числа двух катетов");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String s1 = reader.readLine();
            String s2 = reader.readLine();
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);

        int s = (a*b)/2;
        int n = (a*a)+(b*b);
        double c = Math.sqrt(n);
        double p = a + b + c;

        System.out.println("Площадь прямоугольного треугольника = " + s);
        System.out.println("Периметр прямоугольного треугольника = " + p);
    }
}
//В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
//Вычислить и вывести на экран площадь треугольника и его периметр(a и b – вводит пользователь).