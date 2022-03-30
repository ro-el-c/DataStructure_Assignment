package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_Stack {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayStack as = new ArrayStack();

        char[] arr = br.readLine().toCharArray();

        for (char c : arr) {
            if(c == '(')
                as.push(')');
            else if(c == ')')
                as.push('(');
            else if(c == ' ')
                continue;
            else
                as.push(c);
        }

        while(as.size() > -1)
            sb.append(as.pop() + " ");

        System.out.println(sb);
    }
}
