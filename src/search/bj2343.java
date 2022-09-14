package search;

import java.util.Scanner;

public class bj2343 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int B = sc.nextInt();

        int[] A = new int[L];
        int s = 0;
        int e = 0;
        for (int i = 0; i < L; i++) {
            A[i] = sc.nextInt();
            if (s < A[i]) s = A[i];
            e += A[i];
        }
        while (s <= e) {
            int mid = (s + e) / 2;
            int sum = 0;
            int count = 0;
            for (int i = 0; i < L; i++) {
                if (sum + A[i] > mid) {
                    count++;
                    sum = 0;
                }
                sum = sum + A[i];
            }
            if (sum != 0) {
                count++;
            }
            if (count > B) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            System.out.println(count);
        }
        System.out.println(s);
    }
}
