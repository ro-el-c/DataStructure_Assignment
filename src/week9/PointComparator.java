package week9;

import java.util.Comparator;

public class PointComparator implements Comparator {
    // key   : (0, 0)에서부터 value 좌표까지의 거리
    // value : 해당 좌표

    @Override
    public int compare(Object o1, Object o2) {
        return (int)o1 - (int)o2;
    }
}
