package week5;

import java.util.EmptyStackException;

public class MyStack {
    private MyArrayList arrayList;

    public MyStack(int size){
        this.arrayList = new MyArrayList(size);
    }

    public int size() {
        return this.arrayList.size();
    }

    public boolean isEmpty() {
        return this.arrayList.isEmpty();
    }

    public Object top() throws Exception {
        if(this.arrayList.isEmpty())
            throw new Exception("Stack is Empty");

        return this.arrayList.get(0);
    }

    public void push(Object obj) throws Exception {
        this.arrayList.add(0, obj);
    }

    public Object pop() throws Exception{
        if(this.arrayList.isEmpty())
            throw new Exception("Stack is Empty");

        return this.arrayList.remove(0);
    }

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        MyStack myStack = new MyStack(10);

        for(int i=1; i<=10; i++)
            myStack.push(i);

        for(int i=0; i<10; i++)
            sb.append(myStack.pop()).append("\n");

        System.out.print(sb);
    }
}
