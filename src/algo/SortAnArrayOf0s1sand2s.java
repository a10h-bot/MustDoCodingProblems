package algo;

import java.util.Arrays;

public class SortAnArrayOf0s1sand2s {
    public static void main(String[] args) {
        final int[] arr = new int[]{1, 0, 1, 2, 2, 0, 1, 0, 2};
        System.out.println(Arrays.toString(SortAnArrayOf0s1sand2sHelper(arr)));
    }

    private static int[] SortAnArrayOf0s1sand2sHelper(final int[] arr) {
        int lo = 0, mid = 0, hi = arr.length - 1;
        while (mid <= hi) {
            switch (arr[mid]) {
                case 0: {
                    int temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    int temp = arr[hi];
                    arr[hi] = arr[mid];
                    arr[mid] = temp;
                    hi--;
                    break;
                }
            }

        }
        return arr;
    }
}
