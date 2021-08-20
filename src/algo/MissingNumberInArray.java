package algo;

import java.util.Arrays;

//You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list. One of the integers is missing in the list. Write an efficient code to find the missing integer.
//        Example:
//
//        Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
//        Output: 5
//        Explanation: The missing number from 1 to 8 is 5
//
//        Input: arr[] = {1, 2, 3, 5}
//        Output: 4
//        Explanation: The missing number from 1 to 5 is 4
public class MissingNumberInArray {
    public static void main(String[] args) {
        int [] input ={1, 2, 4, 6, 3, 7, 8};
        System.out.println(helper(input));
    }

    private static int helper(int[] input) {
        int n= input.length+1;
        int sum = n*(n+1)/2;
        return sum-Arrays.stream(input).sum();
    }
}
