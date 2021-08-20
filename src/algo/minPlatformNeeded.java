package algo;

import java.util.Arrays;

//Input:
//arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
//dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
//Output:
public class minPlatformNeeded {
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        // =        {910,1120, 1130,1200, 1900, 2000};
        System.out.println(helper(arr, dep));
    }
//O(nlogn)
    private static int helper(final int[] arr, final int[] dep) {
        if(arr.length==0 || dep.length==0) return 0;
        final int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int maxPlatFormNeeded = 1;
        int neededPlatform = 1;
        int i = 1, j = 0;
        while (i < n && j < n) {
            if (arr[i] >= dep[j]) {
                maxPlatFormNeeded--;
                j++;

            } else if (arr[i] < dep[j]) {
                maxPlatFormNeeded++;
                i++;
            }
            if (maxPlatFormNeeded > neededPlatform) {
                neededPlatform = maxPlatFormNeeded;
            }
        }

        return neededPlatform;
    }
}
