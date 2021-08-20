package slidingwindows;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNumInEveryWindowOfSizeK {
    public static void main(String[] args) {
        final int[] arr = {-1, 4, 2, 10, -2, 3, -3, 1, 0, -20};
        final int n = arr.length;
        final int k = 3;
        helper(arr, n, k);

    }

    private static void helper(final int[] arr, final int n, final int k) {
        final List<Integer> negativeNum = new ArrayList<>();
        if (k > n) throw new IllegalArgumentException();
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
               negativeNum.add(arr[i]);

            }
        }

    }

}
