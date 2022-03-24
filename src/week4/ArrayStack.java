package week4;

import java.util.EmptyStackException;

public class ArrayStack implements Stack {
    public char[] stackArray = new char[100];
    public int size=-1;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == -1;
    }

    public boolean isFull() {
        return this.size() >= stackArray.length-1;
    }

    @Override
    public char top() throws EmptyStackException{
        if(this.isEmpty())
            throw new EmptyStackException();

        return stackArray[this.size-1];
    }

    @Override
    public void push(char o) throws Exception {
        if(this.isFull())
            throw new Exception("Full Stack Exception");

        stackArray[++size] = o;
    }

    @Override
    public char pop() throws EmptyStackException{
        if(this.isEmpty())
            throw new EmptyStackException();

        return stackArray[size--];
    }
}
