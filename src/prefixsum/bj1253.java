package prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj1253 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] A = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(A);
        int count = 0;
        for (int j = 0; j < N; j++) {
            long target = A[j];
            int s = 0;
            int e = N - 1;
            while (s < e) {
                if (A[s] + A[e] >target) {
                    e--;
                } else if (A[s] + A[e] < target) {
                    s++;
                } else {
                    if (s != j && e != j) {
                        count++;
                        break;
                    } else if (s == j) {
                        s++;
                    } else if (e == j) {
                        e--;
                    }
                }
            }
        }
        System.out.println(count);
        br.close();

    }
}
