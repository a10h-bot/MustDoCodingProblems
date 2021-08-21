package AV_BS;

public class rotationCountOfASortedRotatedArray {
    public static void main(String[] args) {
        final int[] SortedArray = new int[]{2, 5, 6, 8, 11, 12, 15, 18};
        final int[] input = new int[]{11, 12, 15, 18, 2, 5, 6, 8};
        System.out.println(rotationCountOfASortedRotatedArrayHelper(input,input.length));
    }
    private static int rotationCountOfASortedRotatedArrayHelper(int[] input,int n) {
        int lo = 0, hi = n- 1;
        while (lo <= hi) {
            int mid = hi + (lo - hi) / 2;
            int nextIndex = (mid + 1) % n;
            int prevIndex = (mid + n - 1) % n;
            if (input[mid] > input[prevIndex] && input[mid] < input[nextIndex]) return mid;
            if (input[lo] <= input[mid]) lo = mid + 1;
            else if (input[mid] <= input[hi]) hi = mid - 1;
        }
        return -1;
    }

}
