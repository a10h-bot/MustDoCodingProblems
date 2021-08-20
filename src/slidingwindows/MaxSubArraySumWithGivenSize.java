package slidingwindows;

//Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}
//        k = 4
public class MaxSubArraySumWithGivenSize {
    public static void main(String[] args) {
        final int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        final int n = arr.length;
        final int k = 4;
        System.out.println(helper(arr, n, k));
    }

    private static int helper(final int[] arr, final int n, final int k) {
        if (k > n) throw new IllegalArgumentException();
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        int windowSum = maxSum;
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }
}
