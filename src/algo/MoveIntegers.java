package algo;
//1. Move all negative integers in the array to the left and all the positive integers to the right and in between 0s.

// A =[1,2,-2,0,6,0,-7]

import java.util.Arrays;

// A =[-2,-7,0,0,1,26]
public class MoveIntegers {
    public static void main(String[] args) {
        int[] A = {1, 2, -2, 0, 6, 0, -7};
        System.out.println(Arrays.toString(helper(A)));
    }

    private static int[] helper(int[] A) {
         int i=0,j=A.length;
         while(i<j){
             if(A[i]<0 && A[j]<0){
                 i++;
             }
             else if(A[i]<0 && A[j]>0){
                j++;
             }
         

         }
        return A;

    }
}