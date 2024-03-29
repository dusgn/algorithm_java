package sort;

import java.util.Scanner;

public class bj1427_selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] counting = new int[10];

        int N = sc.nextInt();

        while (N != 0) {
            counting[N % 10]++;
            N /= 10;
        }

        for (int i = 9; i >= 0; i--) {
            while (counting[i]-- > 0) {
                System.out.print(i);
            }
        }
    }
}
