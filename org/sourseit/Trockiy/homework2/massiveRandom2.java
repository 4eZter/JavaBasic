package org.sourseit.Trockiy.homework.second;

public class massiveRandom2 {
    public static void main(String[] args) {

                int [][] Massive = new int[7][4];
                int [] mLength = new int[Massive.length];

                for(int i =0;i<Massive.length;i++){
                   for(int j=0;j<Massive[i].length;j++){
                       Massive[i][j]=(int)(Math.random()*11)-5;//(int)(min + Math.random()*(max - min + 1));
                        System.out.print(Massive[i][j]+" ");

                        if(j==0){
                            mLength[i] = Massive[i][j];

                        }else mLength[i]*= Massive[i][j];

                        if(j == Massive[i].length-1)
                            System.out.println(" ");
                   }
                }

                int Maximum = 0;
                int index = 0;

                for(int i=0; i < mLength.length; i++){
                    if(Math.abs(mLength[i]) > Maximum){
                        Maximum = mLength[i];
                        index = i;
                    }
                }

                System.out.println("Line Max mod "+Maximum+" has index "+index);
            }
        }

// Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
// Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
// Если таких строк несколько, то вывести индекс первой встретившейся из них.
