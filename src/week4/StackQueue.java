package week4;

import java.util.EmptyStackException;

public class StackQueue implements Queue {
    ArrayStack inStack = new ArrayStack();
    ArrayStack outStack = new ArrayStack();

    @Override
    public int size() {
        return inStack.size() + outStack.size();
    }

    @Override
    public boolean isEmpty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    @Override
    public char front() throws Exception {
        if(this.isEmpty())
            throw new Exception("Empty Queue Exception");

        while(!inStack.isEmpty()){
            outStack.push(inStack.pop());
        }
        return 0;
    }

    @Override
    public void enqueue(char o) throws Exception {
        while(!outStack.isEmpty())
            inStack.push(outStack.pop());

        if(inStack.isFull())
            throw new Exception("Full Queue Exception");

        inStack.push(o);
    }

    @Override
    public char dequeue() throws Exception {
        while(!inStack.isEmpty())
            outStack.push(inStack.pop());

        if(outStack.isEmpty())
            throw new Exception("Empty Queue Exception");

        return outStack.pop();
    }
}