package AV_BS;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        final int[] arr = new int[]{1, 2, 3, 4, 5, 7, 8, 10, 11, 14, 15};
        final int[] arr2 = new int[]{15, 14, 11, 10, 8, 7, 5, 4, 3, 2, 1};
        final int val = 10;
        System.out.println(binarySearchIterative(arr, val));
        System.out.println(binarySearchRecursive(arr, 5));
        System.out.println(binarySearchIterativeOnDescendingArray(arr2, 5));
    }
    private static int binarySearchIterativeOnDescendingArray(final int[] arr, int val) {
        if (arr == null) throw new IllegalArgumentException("argument is null");
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = hi + (lo - hi) / 2;
            if (arr[mid] < val) hi = mid - 1;
            else if (arr[mid] > val) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    private static int binarySearchRecursive(final int[] arr, final int val) {
        int lo = 0, hi = arr.length - 1;
        return binarySearchRecursiveHelper(arr, val, lo, hi);
    }

    private static int binarySearchRecursiveHelper(final int[] arr, final int val, int lo, int hi) {
        while (lo <= hi) {
            int mid = hi + (lo - hi) / 2;
            if (arr[mid] < val) return binarySearchRecursiveHelper(arr, val, mid + 1, hi);
            else if (arr[mid] > val) return binarySearchRecursiveHelper(arr, val, lo, mid - 1);
            return mid;
        }
        return -1;
    }

    public static int binarySearchIterative(final int[] arr, final int val) {
        if (arr == null) throw new IllegalArgumentException("argument is null");
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = hi + (lo - hi) / 2;
            if (arr[mid] < val) lo = mid + 1;
            else if (arr[mid] > val) hi = mid - 1;
            else return mid;
        }
        return -1;
    }


}
