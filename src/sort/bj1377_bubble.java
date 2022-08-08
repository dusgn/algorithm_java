package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj1377_bubble {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        mData[] A = new mData[N];
        for (int i = 0; i < N; i++) {
            A[i] = new mData(Integer.parseInt(br.readLine()), i);
        }
        int max = 0;
        Arrays.sort(A);
        for (int i = 0; i < N; i++) {
            if (max < A[i].idX - i) {
                max = A[i].idX - i;
            }
        }
        System.out.println(max + 1);
    }
}

class mData implements Comparable<mData> {
    int val;
    int idX;

    public mData(int val, int idX) {
        super();
        this.val = val;
        this.idX = idX;
    }

    @Override
    public int compareTo(mData o) {
        return this.val - o.val;
    }

}
