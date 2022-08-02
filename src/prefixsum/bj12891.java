package prefixsum;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj12891 {
    static int[] chkArr;
    static int[] nowArr;
    static int chkSecret;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int result = 0;
        char[] A = new char[S];
        chkArr = new int[4];
        nowArr = new int[4];

        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            chkArr[i] = Integer.parseInt(st.nextToken());
            if (chkArr[i] == 0) {
                chkSecret++;
            }
        }

        for (int i = 0; i < P; i++) {
            add(A[i]);
        }
        if (chkSecret == 4) {
            result++;
        }

        for (int i = P; i < S; i++) {
            int j = i - P;
            add(A[i]);
            remove(A[j]);
            if (chkSecret == 4) {
                result++;
            }
        }

        System.out.println(result);
        br.close();

    }

    private static void add(char c) {
        switch (c) {
            case 'A':
                nowArr[0]++;
                if (nowArr[0] == chkArr[0]) {
                    chkSecret++;
                }
                break;
            case 'C':
                nowArr[1]++;
                if (nowArr[1] == chkArr[1]) {
                    chkSecret++;
                }
                break;
            case 'G':
                nowArr[2]++;
                if (nowArr[2] == chkArr[2]) {
                    chkSecret++;
                }
                break;
            case 'T':
                nowArr[3]++;
                if (nowArr[3] == chkArr[3]) {
                    chkSecret++;
                }
                break;
        }
    }

    private static void remove(char c) {
        switch (c) {
            case 'A':
                if (nowArr[0] == chkArr[0]) {
                    chkSecret--;
                }
                nowArr[0]--;
                break;
            case 'C':
                if (nowArr[1] == chkArr[1]) {
                    chkSecret--;
                }
                nowArr[1]--;
                break;
            case 'G':
                if (nowArr[2] == chkArr[2]) {
                    chkSecret--;
                }
                nowArr[2]--;
                break;
            case 'T':
                if (nowArr[3] == chkArr[3]) {
                    chkSecret--;
                }
                nowArr[3]--;
                break;
        }
    }
}
