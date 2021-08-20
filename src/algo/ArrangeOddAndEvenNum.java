package algo;//Arrange an array so that all the even numbers will move right and odd numbers will move to left.

// [1,2,9,10,6,7]
//[1,9,7,2,6,10]

//1,2,6,7,9,10

public class ArrangeOddAndEvenNum {
    public static void main(String[] args) {
        int[] input = {3, 4, 9, 6, 7};
        //Arrays.toString(arrangeNumbersMethod2(input));
        arrangeNumbersMethod2(input);
        for (int j : input) {
            System.out.println(j);
        }
    }
    private static void arrangeNumbersMethod2(int[] A) {
        int i = 0;
        int j = A.length-1;
        while (i < j) {
            while (A[i] % 2 == 0 && i < j)
                i++;
            while (A[j] % 2 != 0 && i < j)
                j--;
            if (i < j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        }

    }

}
