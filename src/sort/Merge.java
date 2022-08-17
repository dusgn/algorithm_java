package sort;

public class Merge {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 5};
        int[] B = {4, 6, 7, 8};
        int[] merge = merge(A, B);
        print(merge);
    }

    private static int[] merge(int[] a, int[] b) {
        int[] result = new int[8];
        int idx = 0;
        int a_idx = 0;
        int b_idx = 0;
        while (a_idx < a.length && b_idx < b.length) {
            if (a[a_idx] < b[b_idx]) {
                result[idx] = a[a_idx];
                a_idx++;
                idx++;
            } else {
                result[idx] = b[b_idx];
                b_idx++;
                idx++;
            }
            if (a_idx == a.length) {
                while (b_idx < b.length) {
                    result[idx] = b[b_idx];
                    b_idx++;
                    idx++;
                }
            }
            if (b_idx == b.length) {
                while (a_idx < a.length) {
                    result[idx] = a[a_idx];
                    a_idx++;
                    idx++;
                }
            }
        }
        return result;
    }

    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
