package algo;
//Given an array A of n positive numbers. The task is to find the first Equilibium Point in the array.
//        Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
//        Example 1:
//        Input:
//        n = 1
//        A[] = {1}
//        Output: 1
//        Explanation: Since its the only
//        element hence its the only equilibrium
//        point.
//        Example 2:
//
//        Input:
//        n = 5
//        A[] = {1,3,5,2,2}
//        Output: 3
//        Explanation: For second test case
//        equilibrium point is at position 3
//        as elements before it (1+3) =
//        elements after it (2+2).
public class EquilibriumPoint {
    public static void main(String[] args) {
        //int [] arr = {1,3,5,2,2};
        int [] arr ={1,4,2,5};
        System.out.println( helper(arr));
    }
    private static int helper(int[] arr) {
        if(arr.length==1) return 1;
        int n=arr.length;
        int res=0;
         for(int i=1;i<arr.length;i++){
             int x=sum(arr,i+1,n-1);
             int y=sum(arr,0,i-1);
             if(x==y){
                 res=i;
             }
         }
         return res+1;
    }
    private static int sum(int[] arr, int i, int n) {
             int sum=0;
             for(int k=i;k<=n;k++){
                 sum+=arr[k];
             }
             return sum;
    }
}
