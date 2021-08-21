package algo;//Arrange an array so that all the even numbers will move right and odd numbers will move to left.

// [1,2,9,10,6,7]
//[1,9,7,2,6,10]

//1,2,6,7,9,10

import java.util.Arrays;

public class ArrangeOddAndEvenNum {
    public static void main(String[] args) {
        int[] input = {3, 4, 9, 6, 7, 8, 6, 1, 7, 3};
        System.out.println(Arrays.toString(ArrangeOddAndEvenNumHelper(input)));
    }

    private static int[] ArrangeOddAndEvenNumHelper(int[] A) {
        int i = 0;
        int j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 == 0)
                i++;
            else if (A[j] % 2 != 0)
                j--;
            else {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        }
        return A;
    }

}
