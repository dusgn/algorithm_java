package sort;

public class Selection {
    public static void main(String[] args) {
        int[] A = {4, 6, 2, 9, 1};
        selection(A);
        print(A);
    }

    private static void selection(int[] array) {
        int n = array.length;
        for (int i = 0; i < n -1; i++) {    // 마지막은 비교를 하지 않아도 됨
            int min = i;
            for (int j = i+1; j < n ; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            swap(array, i, min );
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
