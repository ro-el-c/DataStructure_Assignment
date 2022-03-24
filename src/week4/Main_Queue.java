package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_Queue {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StackQueue sq = new StackQueue();

        sq.enqueue('a');
        sq.enqueue('b');
        sq.enqueue('c');
        sq.enqueue('d');
        sq.enqueue('e');

        for(int i=0; i<3; i++)
            sq.dequeue();

        sq.enqueue('f');
        sq.enqueue('g');
        sq.enqueue('h');
        sq.enqueue('i');
        sq.enqueue('j');

        for(int i=0; i<3; i++)
            sq.dequeue();

        sq.enqueue('k');
        sq.enqueue('l');
        sq.enqueue('m');
        sq.enqueue('n');
        sq.enqueue('o');

        for(int i=0; i<6; i++)
            sq.dequeue();

        while(!sq.isEmpty())
            sb.append(sq.dequeue() + " ");

        System.out.println(sb);
    }
}
