package stack;

import java.util.Scanner;
import java.util.Stack;

public class bj1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        boolean result = true;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        int num = 1;
        for (int i = 0; i < N; i++) {
            int turn = A[i];
            if (num <= turn) {
                while (num <= turn) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } else {
                Integer pop = stack.pop();
                if (pop > turn) {
                    System.out.println("NO");
                    result = false;
                    break;
                }
                bf.append("-\n");
            }
        }
        if (result) System.out.println(bf.toString());

    }
}
