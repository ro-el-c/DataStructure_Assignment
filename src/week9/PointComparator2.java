package week9;

import java.util.Comparator;

public class PointComparator2 implements Comparator {
    // key   : (0, 0)에서부터 value 좌표까지의 거리
    // value : 해당 좌표
    // 멀리 있는 순 -> 가까운 순과 비교 결과 반대로

    @Override
    public int compare(Object o1, Object o2) {
        return (int)o2 - (int)o1;
    }
}
