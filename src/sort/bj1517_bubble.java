package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class bj1517_bubble {
    public static int[] A, tmp;
    public static long result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        A = new int[N + 1];
        tmp = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        result = 0;
        merge_sort(1, N);
        System.out.println(result);
    }

    public static void merge_sort(int s, int e) {
        if (e - s < 1) {
            return;
        }
        int mid = s + (e - s) / 2;
        merge_sort(s, mid);
        merge_sort(mid + 1, e);
        for (int i = s; i <= e; i++) {
            tmp[i] = A[i];
        }
        int k =s;
        int idx1 = s;
        int idx2 = mid + 1;
        while (idx1 <= mid && idx2 <= e) {
            if (tmp[idx1] > tmp[idx2]) {
                A[k] = tmp[idx2];
                result = result + idx2 - k;
                k++;
                idx2++;
            } else {
                A[k] = tmp[idx1];
                k++;
                idx1++;
            }
        }
        while (idx1 <= mid) {
            A[k] = tmp[idx1];
            k++;
            idx1++;
        }
        while (idx2 <= e) {
            A[k] = tmp[idx2];
            k++;
            idx2++;
        }
    }
}
