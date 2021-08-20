package algo;

import java.util.*;

//https://practice.geeksforgeeks.org/problems/count-the-triplets4615/1
//Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.
//
//        Example 1:
//        Input:
//        N = 4
//        arr[] = {1, 5, 3, 2}
//        Output: 2
//        Explanation: There are 2 triplets:
//        1 + 2 = 3 and 3 +2 = 5
//        Example 2:
//        Input:
//        N = 3
//        arr[] = {2, 3, 4}
//        Output: 0
//        Explanation: No such triplet exits
public class CountTheTriplets {
    public static void main(String[] args) {
        int[] input = {1, 5, 3, 2};
        int n = 4;
        int [] input2={12, 8, 2 ,11, 5 ,14 ,10};
        int n1=7;
        //2,5,8,10,11,12,14
        System.out.println(helper2(input2, n1));
    }
    // 1,2,3,5
//    public static List<List<Integer>> helper(int[] A, int n) {
//        List<List<Integer>> result = new ArrayList<>();
//        int i = 0, j = 1, k = A.length - 1;
//        Arrays.sort(A);
//        while (i < k) {
//            if (A[i] + A[j] == A[k]) {
//                result.add(List.of(A[i], A[j], A[k]));
//                i++;
//                j++;
//                k--;
//            } else if (A[i] + A[j] < A[k]) {
//                k--;
//            } else if (A[i] + A[j] > A[k]) {
//                k--;
//            }
//        }
//        return result;
//    }
//1,5,3,2
    //1,2,3,5
    public static List<List<Integer>> helper2(int[] A, int n) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int item : A){
            set.add(item);
        }
        Arrays.sort(A);
        for(int i=0;i<A.length-1;i++){
            int sum=A[i]+A[i+1];
            if(set.contains(sum)){
                result.add(List.of(A[i],A[i+1],sum));
            }
        }
        System.out.println(result.size());
        return result;
    }
}