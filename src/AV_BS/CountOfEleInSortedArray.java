package AV_BS;

public class CountOfEleInSortedArray {
    public static void main(String[] args) {
        final int[] arr = new int[]{1, 2, 3, 3, 3, 3, 4, 5, 7, 8, 10, 11, 14, 15};
        System.out.println(CountOfEleInSortedArrayHelper(arr,3));
    }

    private static int CountOfEleInSortedArrayHelper(int[] arr, int i) {

        int firstOccurrence= FirstAndLastOccurenceOfAnElement.FirstOccurrenceOfAnElementHelper(arr,i);
        int lastOccurrence=FirstAndLastOccurenceOfAnElement.LastOccurrenceOfAnElementHelper(arr,i);
        if(firstOccurrence==-1 || lastOccurrence==-1) return -1;
        return lastOccurrence-firstOccurrence+1;
    }
}
