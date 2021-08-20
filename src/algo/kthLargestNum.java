package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class kthLargestNum {
    public static void main(String[] args) {
        int[] A = new int[]{1, 23, 12, 9, 30, 2, 50};
        System.out.println(helper3(A, 3));
    }

    private static List<Integer> helper3(int[] array, int k) {
        int n = array.length;
        List<Integer> resultList = new ArrayList<>();
        //1,23,12
        int index = 0;
        for (int i = 0; i < k; i++) {
            resultList.add(array[i]);
        }
        for (int i = k + 1; i < n; i++) {
            int min = findMin(resultList); // min 1 , min 9
            if (array[i] > min) {
                resultList.remove(min);
                resultList.add(array[i]);
            }
            //30,23,50
        }
        return resultList;
    }

    public static int findMin(List<Integer> A) {
        return Collections.min(A);
    }


    private static int[] helper1(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        return new int[]{a[n - 1], a[n - 2], a[n - 3]};
    }

    private static int[] helper2(final int[] a, final int k) {
        final int n = a.length;
        //n =7
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (i != k - 1) {
                    if (a[j] > a[j + 1]) {
                        int temp = a[j + 1];
                        a[j + 1] = a[j];
                        a[j] = temp;
                    }
                }
                if (i == k) {
                    break;
                }
            }
        }
        return new int[]{a[n - 1], a[n - 2], a[n - 3]};
    }
}
