package org.sourseit.Trockiy.homework.second;
//converter
import java.io.IOException;

public class Numbers {

    private static String revByBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void Bin(int i){
        int a;
        String s ="";
        do {
            a=i%2;
            i=i/2;
            s = s + a;
        }while(i!=0);
        System.out.println("Bin: " + revByBuilder(s));
    }

    public static void Oct(int i){
        int a;
            String s ="";
            do {
                a=i%8;
                i=i/8;
                s = s + a;
            }while(i!=0);
        System.out.println("Oct: " + revByBuilder(s));
    }
    public static void Hex(int i) {


        int a;
        String s ="";

        do {
            a = i % 16;
            i = i / 16;

            switch (a) {

                case 0:
                    s = s + "0";
                    break;
                case 1:
                    s = s + "1";
                    break;
                case 2:
                    s = s + "2";
                    break;
                case 3:
                    s = s + "3";
                    break;
                case 4:
                    s = s + "4";
                    break;
                case 5:
                    s = s + "5";
                    break;
                case 6:
                    s = s + "6";
                    break;
                case 7:
                    s = s + "7";
                    break;
                case 8:
                    s = s + "8";
                    break;
                case 9:
                    s = s + "9";
                    break;
                case 10:
                    s = s + "A";
                    break;
                case 11:
                    s = s + "B";
                    break;
                case 12:
                    s = s + "C";
                    break;
                case 13:
                    s = s + "D";
                    break;
                case 14:
                    s = s + "E";
                    break;
                case 15:
                    s = s + "F";
                    break;
            }
        } while (i != 0);

        System.out.println("Hex: " + revByBuilder(s));
    }

    public static void main(String[] args) throws IOException {
//        System.out.println("Please, enter your number");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s = reader.readLine();
//        int i = Integer.parseInt(s);
        int i = 949;
        int c = 763;

        System.out.println("The first number is: " + i);
        System.out.println("number values");
        Bin(i);
        Oct(i);
        Hex(i);

        System.out.println();

        System.out.println("The second number is: " + c);
        System.out.println("number values");
        Bin(c);
        Oct(c);
        Hex(c);
    }
}
//Переведите числа из десятичной системы счисления в двоичную,
//восьмеричную и шестнадцатеричную системы счисления.
//а) 949;
//б) 763;

//        949
//        Bin: 1110110101
//        Oct: 1665
//        Hex: 3B5

//        763
//        Bin: 1011111011
//        Oct: 1373
//        Hex: 2FB