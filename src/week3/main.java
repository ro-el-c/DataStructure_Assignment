package week3;

import java.math.BigInteger;

public class main {
    static StringBuilder sb = new StringBuilder();
    static int[] arr;

    public static long power(long x, long n){
        // 5^16 구하는 프로그램
        if(n==0)
            return 1;
        if(n%2 == 1){
            long y = power(x, (n-1)/2);
            long temp = x*y*y;
            return temp;
        }
        else{
            long y = power(x, n/2);
            long temp = y*y;
            return temp;
        }
    }

    public static int binarySum(int[] arr, int i, int n){
        // 1~100 까지 합산
        if(n==1)
            return arr[i];
        else
            return binarySum(arr, i, (n+1)/2) + binarySum(arr, i+(n+1)/2, n/2);
    }

    public static pair linearFibonacci(BigInteger n){
        // 100번째 수열까지 출력
        if(n.compareTo(BigInteger.ONE) == 0){
            pair temp = new pair(n, BigInteger.ZERO);
            sb.append(temp.n + " ");
            return temp;
        }
        else{
            pair next = linearFibonacci(n.subtract(BigInteger.ONE));
            pair temp2 = new pair(next.n.add(next.nMinus1), next.n);
            sb.append(temp2.n + " ");
            return temp2;
        }
    }

    static class pair{
        BigInteger n, nMinus1;

        pair(BigInteger a, BigInteger b){
            n = a;
            nMinus1 = b;
        }
    }

    public static void main(String[] args) {
        // 5^16 출력
        sb.append("5^16 = ");
        sb.append(power(5, 16)).append("\n");

        sb.append("\n");

        // 1부터 100까지의 숫자 합산
        sb.append("sum of 1~100 = ");
        arr = new int[101];
        for(int i=1; i<=100; i++)
            arr[i] = i;
        sb.append(binarySum(arr, 1, 100)).append("\n");

        sb.append("\n");

        // 피보나치 100번째 수열까지 출력
        sb.append("Fibonacci 1st to 100th number : ").append("\n");
        pair temp = linearFibonacci(BigInteger.valueOf(100));

        System.out.print(sb);
    }
}
