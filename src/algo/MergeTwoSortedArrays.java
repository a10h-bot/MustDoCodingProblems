package algo;

import java.util.Arrays;

//Given two sorted arrays, the task is to merge them in a sorted manner.
//        Examples:
//
//        Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
//        Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
//        Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8}
//        Output: arr3[] = {4, 5, 7, 8, 8, 9}
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int []arr1 = { 1, 3, 4, 5};
        int []arr2= {2, 4, 6, 8};
        System.out.println(Arrays.toString(helper(arr1,arr2)));
    }
    private static int[] helper(int[] arr1, int[] arr2) {
        int n1=arr1.length;
        int n2=arr2.length;
        int [] mergedArray= new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                mergedArray[k++]=arr1[i++];
            }
            else
                mergedArray[k++]=arr2[j++];
            }
            while (i < n1)
                mergedArray[k++] = arr1[i++];
            while (j < n2)
                mergedArray[k++] = arr2[j++];
        return  mergedArray;
    }
}
