package org.sourseit.Trockiy.homework.second;
//converter
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reCourse {

      public static int sum(int n){
        int i=1;
        while(i <= n){

            return n+sum(n-1);
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Please, enter your number");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int i = Integer.parseInt(s);

        System.out.println("The sum of numbers from 1 to your number is: " + sum(i));
    }

}

//Написать метод, который для данного числа n (заданного с клавиатуры) вычисляет сумму чисел от 1 до n;