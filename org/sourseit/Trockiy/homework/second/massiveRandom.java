package org.sourseit.Trockiy.homework.second;

public class massiveRandom {
    public static void main(String[] args) {
        int[][] a = new int[8][5];

        for(int i = 0; i < a.length; i++){
            int max = 99;
            int min = 10;
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = (int)(min + Math.random()*(max - min + 1));
                System.out.print(a[i][j] + " ");
                }
            System.out.println(" ");
        }
    }
}
//Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных
// целых чисел из отрезка [10;99]. Вывести массив на экран.