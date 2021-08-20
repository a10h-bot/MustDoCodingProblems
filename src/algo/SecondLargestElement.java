package algo;

import java.util.Arrays;

//Input: arr[] = {12, 35, 1, 10, 34, 1}
public class SecondLargestElement {
    public static void main(String[] args) {
        int [] input = {12, 35, 1, 10, 34, 1};
        System.out.println(helper2(input));
    }
    private static int helper(int[] input) {
        Arrays.sort(input);
        return  input[input.length-2];
    }
    private static int helper2(int[] input) {
        int n= input.length;
      int firstElement = Integer.MIN_VALUE,secondElement = Integer.MIN_VALUE;
      for (int i=0;i<n-1;i++){
          if(input[i]>firstElement){
              secondElement=firstElement;
              firstElement=input[i];
          }
          else if(input[i]>secondElement & input[i]!=firstElement){
              secondElement=input[i];
          }
      }
        return  secondElement;
    }
}
