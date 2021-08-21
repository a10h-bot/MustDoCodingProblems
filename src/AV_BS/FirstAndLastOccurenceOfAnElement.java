package AV_BS;

public class FirstAndLastOccurenceOfAnElement {
    public static void main(String[] args) {
        final int[] arr = new int[]{1, 2, 3, 3, 3, 3, 4, 5, 7, 8, 10, 11, 14, 15};
        final int val = 3;
        System.out.println(FirstOccurrenceOfAnElementHelper(arr, val));
        System.out.println(LastOccurrenceOfAnElementHelper(arr, val));

    }

    public static int FirstOccurrenceOfAnElementHelper(int[] arr, int val) {
        int lo=0,hi =arr.length-1,res=-1;
        while (lo <= hi) {
            int mid = hi + (lo - hi) / 2;
            if (arr[mid] < val) lo = mid + 1;
            else if (arr[mid] > val) hi = mid - 1;
            else {
                res = mid;
                hi=mid-1;
            }
        }
        return res;
    }
    public static int LastOccurrenceOfAnElementHelper(int[] arr, int val) {
        int lo=0,hi =arr.length-1,res=-1;
        while (lo <= hi) {
            int mid = hi + (lo - hi) / 2;
            if (arr[mid] < val) lo = mid + 1;
            else if (arr[mid] > val) hi = mid - 1;
            else {
                res = mid;
                lo=mid+1;
            }
        }
        return res;
    }
}
