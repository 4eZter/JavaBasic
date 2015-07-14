package org.sourseit.Trockiy.homework.second;

public class binSum {

    public static void sum(String n1, String n2, String n3, String n4){
        int res1;
        int res2;
        binToDec bNum = new binToDec();
        res1 = bNum.binToDec(n1)+bNum.binToDec(n2);
        res2 = bNum.binToDec(n3)+bNum.binToDec(n4);
        System.out.println("The first sum is: " + res1);
        System.out.println("The second sum is: " + res2);
    }
    public static void main(String[] args) {
        int i = 1110101010;
        String n1 = ""+ i;

        int c = 10111001;
        String n2 = ""+ c;

        int d = 10111010;
        String n3 = ""+ d;

        int a = 10010100;
        String n4 = ""+ a;

        sum(n1, n2, n3, n4);

    }
}
//Выполните сложение чисел.
//а) 11101010102+101110012;
//б) 101110102+100101002;
