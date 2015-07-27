package org3.sourseit.Trockiy.homework.homework2;

public class binRaz {
    public static void main(String[] args) {
        int i = 1000000100;
        String s1 = ""+ i;

        int c = 101010001;
        String s2 = ""+ c;

        int d = 1010111101;
        String s3 = ""+ d;

        int a = 111000010;
        String s4 = ""+ a;

        Raz(s1, s2, s3, s4);

    }


    private static void Raz(String s1, String s2, String s3, String s4) {
        int res1;
        int res2;
        binToDec bNum2 = new binToDec();
        res1 = bNum2.binToDec(s1)-bNum2.binToDec(s2);
        res2 = bNum2.binToDec(s3)-bNum2.binToDec(s4);
        System.out.println("The homework1 raz is: " + res1);
        System.out.println("The homework2 raz is: " + res2);
    }
}
//4. Выполните вычитание чисел.
//а) 10000001002-1010100012;
//б) 10101111012-1110000102;

