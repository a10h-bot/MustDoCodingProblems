package algo;

import java.util.Arrays;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 4, 9, 10, 12};
        int[] arr2 = new int[]{3, 5, 7, 8, 11, 12, 13, 14};
        System.out.println(Arrays.toString(helper(arr1, arr2)));
    }

    private static int[] helper(int[] arr1, int[] arr2) {
        if (arr1 == null) return arr2;
        if (arr2 == null) return arr1;
        int i = 0, j = arr1.length;
        int k = 0, l = arr2.length;
        final int[] res = new int[j + l];
        //1,2,3,5,7,8,10;
        int index = 0;
        while (i < j && k < l) {
            if (arr1[i] < arr2[k]) {
                res[index++] = arr1[i++];
            } else
                res[index++] = arr2[k++];
        }
        while (i < j)
            res[index++] = arr1[i++];
        while (j < l)
            res[index++] = arr2[j++];
        return res;
    }
}
