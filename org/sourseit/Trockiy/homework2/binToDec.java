package org.sourseit.Trockiy.homework.second;

import java.io.IOException;

public class binToDec {

    public static int eachNumber(int a, int radix) {
        int result = 1;
        for (int i = 0; i < radix; i++) {
            result = result * a;
        }
        return result;
    }

    public static int binToDec(String bin){
        int result = 0;//main result
        int num = 0;
        int numRad = 0;

        char[] charMas = bin.toCharArray();//String "111000111" to char[]{'1', '1', '1'...}

        for(int length = charMas.length-1; length >= 0; length--){//уменьшение длинны массива при каждой итерации
            num = Character.getNumericValue(charMas[length]);// занесение числового значения символов

            int algorythm = 0;
            algorythm = num * eachNumber(2, numRad);//a^n*q^n
            numRad++;//radix increment;

            result = result + algorythm;//a^n * q^n + a1^n1 * q1^n1,,,
        }
        return result;
    }

    public static void main(String[] args) throws IOException {

//        System.out.println("please, enter your bin number");
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String bin = reader.readLine();
//        System.out.println(binToDec(bin));

        int i = 111000111;
        String bin = ""+ i;
        System.out.println("The first number is: " + binToDec(bin));

        int c = 100011011;
        String bin2 = "" + c;
        System.out.println("The second number is: " + binToDec(bin2));
    }


}

//Переведите числа в десятичную систему счисления.
//а) 1110001112;
//б) 1000110112;
