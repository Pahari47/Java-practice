import java.util.*;

public class Questions {
    public static void balancedString(String str, int n) {
        if (n == 0) {
            System.out.println("null");
        }

        int r = 0, l = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'R') {
                r++;
            }
            if (str.charAt(i) == 'L') {
                l++;
            }

            if (r == l) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static int kthOdd(int L, int R, int k) {
        if (R % 2 == 0) {
            R--;
        }

        int totalOdds = (R - L) / 2 + 1;

        if (k > totalOdds) {
            return 0;
        }

        return R - (k - 1) * 2;
    }

    public static String smallStringWithSum(int n, int k) {
        char[] result = new char[n];

        for(int i=0; i<n; i++) {
            result[i] = 'a';
        }

        int extra = k - n;
        int index = n - 1;

        while (extra > 0 && index >= 0) {
            int add = Math.min(extra, 25);

            result[index] = (char)(result[index] + add);
            extra -= add;
            index--;
        }

        return new String(result);
    }


    public static void main(String[] args) {
        int n = 3, k= 42;

        System.out.println(smallStringWithSum(n, k));
    }
}