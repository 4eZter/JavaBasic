package org3.sourseit.Trockiy.homework.homework4;

public class StackIml implements Stack {

    private Object[] stack;
    private int counter;

    public StackIml(int size) {
        stack = new Object[size];
        counter = -1;
    }

    @Override
    public void push(Object o) throws StackException {
        for (int i = 0; i < stack.length; i++)
        if (counter == stack.length - 1) {
            throw new StackException(1);
        } else stack[++counter] = o;

    }

    @Override
    public Object pop() throws StackException {
        for (int i = 0; i < stack.length; i++)
        if (counter < 0) {
            throw new StackException(2);
        }
            else return stack[counter--];
        return null;
    }


    @Override
    public void clear() {
        for (int i = 0; i < stack.length; i++) {
            stack[i] = null;
        }
    }

    @Override
    public void print() {
        for (int i = 0; i < stack.length; i++) {

            System.out.println(stack[i]);
        }
    }
}

