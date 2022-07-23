package prefixsum;

import java.util.Scanner;

public class bj2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int s_idx = 1;
        int e_idx = 1;
        int sum = 1;
        while (e_idx < N) {
            if (sum == N) {
                count++;
                e_idx++;
                sum += e_idx;
            } else if (sum < N) {
                e_idx++;
                sum += e_idx;
            } else if (sum > N) {
                sum -= s_idx;
                s_idx++;
            }
        }
        System.out.println(count);
    }
}
