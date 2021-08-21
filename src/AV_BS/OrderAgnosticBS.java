package AV_BS;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        final int[] arr = new int[]{1, 2, 3, 4, 5, 7, 8, 10, 11, 14, 15};
        final int val=7;
        System.out.println(OrderAgnosticBSHelper(arr,val));
    }

    private static int OrderAgnosticBSHelper(final int[] arr,int val) {
        if(arr.length==1) return 0;
        if(arr[0]<arr[1]){
            int lo = 0, hi = arr.length - 1;
            while (lo <= hi) {
                int mid = hi + (lo - hi) / 2;
                if (arr[mid] < val) lo = mid + 1;
                else if (arr[mid] > val) hi = mid - 1;
                else return mid;
            }
        }
        else {
            int lo = 0, hi = arr.length - 1;
            while (lo <= hi) {
                int mid = hi + (lo - hi) / 2;
                if (arr[mid] < val) hi = mid - 1;
                else if (arr[mid] > val) lo = mid + 1;
                else return mid;
            }
        }
        return -1;
    }
}
