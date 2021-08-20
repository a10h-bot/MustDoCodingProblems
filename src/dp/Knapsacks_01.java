package dp;
//int val[] = new int[] { 60, 100, 120 };
//        int wt[] = new int[] { 10, 20, 30 };
//        int W = 50;


public class Knapsacks_01 {
    public static void main(String[] args) {
        int[] val = new int[]{60, 100, 120};
        int[] wt = new int[]{10, 20, 30};
        int W = 50;
        int n = 3;
        System.out.println(helper(val, wt, W, n));
    }
    private static int helper(final int[] val, final int[] wt, int w, int n) {
        int [] [] dp = new int[100][100];
        if (n == 0 || w == 0) return 0;
        if(dp[n][w] !=0){
            return dp[n][w];
        }
        if (wt[n - 1] <= w) {
            dp[n][w]= Math.max(val[n - 1] + helper(val, wt, w - wt[n - 1], n - 1), helper(val, wt, w, n - 1));
        } else dp[n][w]= helper(val, wt, w, n - 1);
     return  dp[n][w];
    }
}
