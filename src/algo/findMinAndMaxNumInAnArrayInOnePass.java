package algo;
public class findMinAndMaxNumInAnArrayInOnePass {
    public static void main(String[] args) {
        int [] arr = {12, 35, 1, 10, 34, 1,-1,100};
        helper(arr);
    }
    private static void helper(int[] arr) {
        int min=arr[0];
        int max=min;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("min value" +"-> " +min );
       System.out.println("max value" +"-> " +max);
    }
}
