package week9;

import java.util.ArrayList;
import java.util.Comparator;

public class MyPQ {
    private  ArrayList list;
    private Comparator cmpt;

    MyPQ(Comparator comp){
        this.list = new ArrayList();
        this.cmpt = comp;
    }
    MyPQ(int initialCapacity, Comparator comp){
        this.list = new ArrayList(initialCapacity);
        this.cmpt = comp;
    }

    public int size(){
        return this.list.size();
    }
    public boolean isEmpty(){
        return this.list.isEmpty();
    }

    // sorted list 기반 -> insert 할 때, 우선 순위 따져서 올바른 자리에
    public MyEntry insert(Object k, Object v){
        MyEntry newEntry = new MyEntry(k, v);

        int whereTo=0;
        int length = this.list.size();

        for(int i=0; i<length; i++){
            MyEntry temp = (MyEntry) list.get(i);
            if(this.cmpt.compare(k, temp.getKey()) > 0) // k의 우선순위가 temp 보다 작을 때
                whereTo++;
        }
        list.add(whereTo, newEntry);

        return newEntry;
    }

    public MyEntry removeMin(){
        return (MyEntry)list.remove(0);
    }

    public MyEntry min(){
        return (MyEntry)list.get(0);
    }
}
