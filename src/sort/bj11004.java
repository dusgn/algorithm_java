package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

    }

    public static void quick(int[] A, int s, int e, int K) {
        if (s < e) {
            int pivot = partition(A, s, e);
            if (pivot == K) {
                return;
            } else if (K < pivot) {
                quick(A, s, pivot - 1, K);
            } else {
                quick(A, pivot + 1, e, K);
            }
        }
    }

    public static int partition(int[] A, int s, int e) {
        int M = (s + e) / 2;
        swap(A, s, e);
        int pivot = A[s];
        int i = s, j = e;
        while (i < j) {
            while (pivot < A[j]) {
                j--;
            }
            while (i < j && pivot >= A[i]) {
                i++;
            }
            swap(A, i, j);
        }
        A[s] = A[i];
        A[i] = pivot;
        return i;
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
