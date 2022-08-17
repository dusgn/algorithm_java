package sort;

public class Insert {
    public static void main(String[] args) {
        int[] A = {4, 6, 2, 9, 1};
        insert(A);
        print(A);
    }

    private static void insert(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }
    private static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

