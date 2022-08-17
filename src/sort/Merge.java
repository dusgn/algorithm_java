package sort;

public class Merge {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 5};
        int[] B = {4, 6, 7, 8};
        int[] result = new int[8];
        merge(result, A, B);
        print(result);
    }

    private static void merge(int[] res, int[] a, int[] b) {
        int idx = 0;
        int a_idx = 0;
        int b_idx = 0;
        while (a_idx < a.length && b_idx < b.length) {
            if (a[a_idx] < b[b_idx]) {
                res[idx] = a[a_idx];
                a_idx++;
                idx++;
            } else {
                res[idx] = b[b_idx];
                b_idx++;
                idx++;
            }
            if (a_idx == a.length) {
                while (b_idx < b.length) {
                    res[idx] = b[b_idx];
                    b_idx++;
                    idx++;
                }
            }
            if (b_idx == b.length) {
                while (a_idx < a.length) {
                    res[idx] = a[a_idx];
                    a_idx++;
                    idx++;
                }
            }
        }
    }

    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
