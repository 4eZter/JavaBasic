package org3.sourseit.Trockiy.homework.homework4;

public class StackException extends Exception {

    public StackException(int var){

        if(var == 1){
            System.out.println("Stack is full");
        }else if (var == 2){
            System.out.println("Stack is empty");
        }
    }
}
