package prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int count = 0;
        int s = 0;
        int e = N - 1;

        while (s < e) {
            if (A[s] + A[e] < M) {
                s++;
            } else if (A[s] + A[e] > M) {
                e--;
            } else {
                e--;
                s++;
                count += 1;
            }
        }
        System.out.println(count);
        br.close();
    }
}
