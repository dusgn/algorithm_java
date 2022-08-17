package sort;


public class MergeDivideAndConquer {
    public static void main(String[] args) {
        int[] A = {5, 3, 2, 1, 6, 8, 7, 4};
        print(merge_sort(A));
    }

    private static int[] merge_sort(int[] c) {
        if (c.length <= 1) {
            return c;
        }
        int mid = c.length / 2;
        int[] front = new int[mid];
        int[] back = new int[mid];
        System.arraycopy(c, 0, front, 0,mid);
        System.arraycopy(c, mid, back, 0,mid);
        return merge(merge_sort(front), merge_sort(back));
    }

    private static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length+b.length];
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


