package algo;
//1. Move all negative integers in the array to the left and all the positive integers to the right and in between 0s.

// A =[1,2,-2,0,6,0,-7]

import java.util.Arrays;

// A =[-2,-7,0,0,1,26]
public class MoveIntegers {
    public static void main(String[] args) {
        int[] A = {1, 2, -2, 0, 6, 0, -7};
        System.out.println(Arrays.toString(MoveIntegersHelper(A)));
    }

    private static int[] MoveIntegersHelper(final int[] arr) {
        int lo = 0, mid = 0, hi = arr.length - 1;
        while (mid <= hi) {
            int e = arr[mid];
            if (e < 0) {
                int temp = arr[lo];
                arr[lo] = arr[mid];
                arr[mid] = temp;
                lo++;
                mid++;
            } else if (e == 0) {
                mid++;
            } else {
                int temp = arr[hi];
                arr[hi] = arr[mid];
                arr[mid] = temp;
                hi--;
            }
        }
        return arr;
    }

}
