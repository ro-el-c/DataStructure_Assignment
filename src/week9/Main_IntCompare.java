package week9;

public class Main_IntCompare {
    public static void main(String[] args) {
        IntComparator c = new IntComparator();
        MyPQ pq = new MyPQ(c);

        pq.insert(new Integer(30), null);
        pq.insert(new Integer(10), null);
        pq.insert(new Integer(20), null);

        System.out.println((Integer)pq.removeMin().getKey());
        System.out.println((Integer)pq.removeMin().getKey());
        System.out.println((Integer)pq.removeMin().getKey());

    }
}
