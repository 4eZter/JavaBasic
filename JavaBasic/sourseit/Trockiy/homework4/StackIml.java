package org3.sourseit.Trockiy.homework.homework4;

public class StackIml implements Stack {

    private Object[] stack;
    private int massLength;
    private int counter;

    public StackIml(int size) {
        massLength = size;
        stack = new Object[massLength];
    }

    @Override
    public void push(Object o) throws StackException {
        for (int i = 0; i <massLength; i++){
            if (counter>=massLength){
                throw new StackException(1);

            }else if(stack[i] == null){
                ++counter;
                stack[i] =  o;
                System.out.println("добавлен элемент: " + o);
                break;
            }
        }
    }

    @Override
    public Object pop() throws StackException {
        for (int i = 0; i < massLength; i++){
            if(stack[i] != null){
                    Object o = stack[i];
                    stack[i]=null;
                    --counter;
                    return o;
            } else if(counter < 1) {
            throw new StackException(2);
        }
    }return null;
}


    @Override
    public void clear() {
        for (int i = 0; i < massLength; i++) {
            stack[i] = null;

        }
        counter = 0;
    }

    @Override
    public void print() {
        System.out.println("\nсодержание стека: ");
        for (int i = 0; i < massLength; i++) {

            System.out.print(stack[i]+", ");
        }
    }
}


