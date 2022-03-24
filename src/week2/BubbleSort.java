package week2;

public class BubbleSort {
    public static void bubblesort(int[] arr){      // arr 의 길이 : n
        for(int i=0; i<arr.length; i++){           // pass 1 ~ n : n
            for(int j=0; j<arr.length-i-1; j++){   // 각 pass 당 n-i 번 비교
                if(arr[j]>arr[j+1]){               // 비교 1회 자리바꿈 : O(1) 의 시간
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("After bubble sort : ");

        int[] arr = new int[]{5, 9, 12, 11, 2, 4, 31, 6, 54, 10};
        bubblesort(arr);

        for(int i:arr)
            sb.append(i + " ");
        System.out.print(sb);
    }
}

