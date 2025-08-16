import java.util.*;
public class longestChain {
    public static void main(String[] args) { // O(nlogn)
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chaiLen = 1;
        int pairEnd = pairs[0][1]; // last selected pair end

        for(int i=1; i<pairs.length; i++) {
            if (pairs[i][0] > pairEnd) {
                chaiLen++;
                pairEnd = pairs[i][1];
            }
        }

        System.out.println("max length of chain : " + chaiLen);

    }
}
