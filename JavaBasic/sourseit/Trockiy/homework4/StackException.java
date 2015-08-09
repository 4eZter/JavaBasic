package org3.sourseit.Trockiy.homework.homework4;

public class StackException extends Exception {

    public StackException(int var){

        if(var == 1){
            System.out.println("Стек переполнен!");
        }else if (var == 2){
            System.out.println("Стэк пуст!");
        }
    }
}
