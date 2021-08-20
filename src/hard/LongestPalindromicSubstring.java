package hard;
//Input: Given string :"forgeeksskeegfor",
//        Output: "geeksskeeg"
//
//        Input: Given string :"Geeks",
//        Output: "ee"
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        final String str ="forgeeksskeegfor";
        helper(str);
    }

    private static void helper(String str) {
        final int n = str.length();
        boolean [][] dp = new boolean[n][n];
        int maxLength=1;
        for(int i=0;i<n;i++){
            dp[i][i]=true;
        }
        int start =0;
       for(int i=0;i<n-1;i++){
           if(str.charAt(i)==str.charAt(i+1)){
               dp[i][i+1] =true;
               start=i;
               maxLength=2;
           }
       }
    }
}
