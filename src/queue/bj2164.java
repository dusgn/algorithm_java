package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            queue.poll();
            result = queue.poll();
            queue.add(result);
        }

        System.out.println(result);
    }
}
