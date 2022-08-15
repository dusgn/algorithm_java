package sort;

public class Bubble {
    public static void main(String[] args) {
        int[] A = {4, 6, 2, 9, 1};
        bubble(A);
        print(A);
    }

    private static void bubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length -1 -i; j++) {
                if (array[j] > array[j + 1]) {
                 swap(array, j, j+1);
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
