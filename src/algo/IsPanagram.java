package algo;
//Check if a given string is Pangram in Java

//Input: str = “Abcdefghijklmnopqrstuvwxyz”
//        Output: Yes
//        Explanation: The given string contains all the letters from a to z (ignoring case).
//
//        Input: str = “GeeksForGeeks”
//        Output: No
//        Explanation: The given string does not contain all the letters from a to z (ignoring case).
public class IsPanagram {
    public static void main(String[] args) {
        String input = "Abcdefghijklmnopqrstuvwxyz";
        String input2 ="GeeksForGeeks";
        System.out.println(helper(input));

    }
    private static boolean helper(String str) {
        str =str.toLowerCase();
        boolean areAllPresent =true;
        for(char ch ='a';ch<='z';ch++){
            if(!str.contains(String.valueOf(ch))){
                areAllPresent =false;
                break;
            }
        }
        return areAllPresent;
    }
}
