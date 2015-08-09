package org.sourseit.Trockiy.homework.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reCourse2 {

    public static boolean isPrime(int i, int n){

    boolean prime=true;

    if (i<=(int)Math.sqrt(n)){

            if (i%n == 0)
            prime = false;


    }
        return prime;
    }


    public static int Rec(int numEnter, int need) {

        if (isPrime(numEnter, need)) {
            if(need%2!=0|need==2)
            System.out.print(need + " ");

            numEnter--;

            need++;

            return need + Rec(numEnter-1, need);
        }
        return 1;



    }


    public static void main(String[] args) throws IOException {


        System.out.println("Please, enter your number");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int number = Integer.parseInt(s);
        int num = 2;
        Rec(number,num);
    }
}
// Создайте код, который выводит все простые числа(узнать, что такое простое число)
// из интервала от 2доn (заданного с клавиатуры). Результат должен быть: 2,3,5,7 ...