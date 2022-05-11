package week11;

public class Main {
    public static void main(String[] args) {
        System.out.print("--실습 1--");
        MyHashTable mht = new MyHashTable(13);

        System.out.println(mht.put("0101", "AA"));
        System.out.println(mht.put("0202", "BB"));
        System.out.println(mht.put("0303", "DC"));
        System.out.println(mht.put("0404", "CF"));
        System.out.println(mht.put("0505", "QW"));
        System.out.println(mht.put("0606", "ZH"));
        System.out.println(mht.put("0707", "SN"));
        System.out.println(mht.put("0808", "YJ"));
        System.out.println(mht.put("0909", "GO"));
        System.out.println(mht.put("1010", "DK"));

        mht.printNowHashTable();

        System.out.println("\n\n--실습 2--");
        MyHashTable mht2 = new MyHashTable(13, 0.9F);

        System.out.println(mht2.put("0101", "AK"));
        System.out.println(mht2.put("0202", "BS"));
        System.out.println(mht2.put("0303", "SC"));
        System.out.println(mht2.put("0404", "CG"));
        System.out.println(mht2.put("0505", "QQ"));
        mht2.printNowHashTable();
        System.out.println(mht2.put("0606", "ZV"));
        System.out.println(mht2.put("0707", "SZ"));
        System.out.println(mht2.put("0808", "YM"));
        System.out.println(mht2.put("0909", "GO"));
        System.out.println(mht2.put("1010", "DK"));
        mht2.printNowHashTable();
        System.out.println(mht2.put("1111", "AP"));
        System.out.println(mht2.put("1122", "AL"));
        mht2.printNowHashTable();
        System.out.println(mht2.put("1133", "CM"));
        mht2.printNowHashTable();
        System.out.println(mht2.put("1144", "AN"));
        System.out.println(mht2.put("1155", "KO"));
        mht2.printNowHashTable();
    }
}
