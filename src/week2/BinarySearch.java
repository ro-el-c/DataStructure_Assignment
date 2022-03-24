package week2;

public class BinarySearch {
    public static void binarySearch(int[] arr, int key){
        int mid, lo=0, hi=arr.length-1;

        while(lo <= hi){
            mid = (lo+hi)/2;

            if(key == arr[mid]){
                System.out.println("Index of " + key + " is : " + mid);
                break;
            }

            if(key < arr[mid])
                hi = mid-1;
            if(key > arr[mid])
                lo = mid+1;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 5, 7, 9, 10, 12, 13, 20};
        binarySearch(arr, 5);
    }
}
