package week5;

public class MyQueue {
    private MyArrayList arrayList;

    public MyQueue(int size){
        this.arrayList = new MyArrayList(size);
    }

    public int size() {
        return this.arrayList.size();
    }

    public boolean isEmpty() {
        return this.arrayList.isEmpty();
    }

    public Object front() throws Exception {
        if(this.arrayList.isEmpty())
            throw new Exception("Queue is Empty");

        return this.arrayList.get(this.arrayList.size()-1);
    }

    public void enqueue(Object obj) throws Exception {
        this.arrayList.add(0, obj);
    }

    public Object dequeue() throws Exception {
        if(this.arrayList.isEmpty())
            throw new Exception("Queue is Empty");

        return this.arrayList.remove(this.arrayList.size()-1);
    }

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        MyQueue myQueue = new MyQueue(10);

        for(int i=1; i<=10; i++)
            myQueue.enqueue(i);

        for(int i=0; i<10; i++)
            sb.append(myQueue.dequeue()).append("\n");

        System.out.print(sb);
    }
}
