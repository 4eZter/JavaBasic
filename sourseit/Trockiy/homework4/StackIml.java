package org3.sourseit.Trockiy.homework.homework4;

public class StackIml implements Stack {

    Object[] objects = new Object[5];

    @Override
    public void push(Object o) throws StackException {
        for (int i = 0; i < objects.length; i++){
            //if empty
            if(objects[i] == null){
                if()
            }
        }

    }

    @Override
    public Object pop() throws StackException {
        for (int i = 0; i < objects.length; i++){

        }
        return null;
    }

    @Override
    public void clear() {
        for (int i = 0; i < objects.length; i++){
            objects[i] = null;
        }
    }

    @Override
    public void print() {
        for (Object object : objects) object.toString();
    }
}
