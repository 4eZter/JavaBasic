package org.sourseit.Trockiy.homework.first;

/**
 * Created by CheZter on 18.06.2015.
 */
public class fibonach {
    public static void main(String[] args){
        int a = 1;
        int b = 1;
        int n = 11;
        int sum;
        int i = 2;

        System.out.print(a + " " + b + " ");

        while(i < n){
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
            i++;
        }
    }
}
//Выведите на экран первые 11 членов последовательности Фибоначчи.
//Напоминаем, что первый и второй члены последовательности равны единицам,
//а каждый следующий — сумме двух предыдущих.