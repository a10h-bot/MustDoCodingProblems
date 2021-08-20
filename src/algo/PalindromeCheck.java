package algo;//Given string is palindrome but there is a character added in string at any index and now this is not palindrome.
//        return index of wrong character.

//aba = j =3
 // abba i=0, j = str.length;
public class PalindromeCheck {

    static boolean isPalindrome(String str,
                                int i, int j) {
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static int possiblePaulinDomeByRemovingOneChar(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                if (isPalindrome(str, i + 1, j))
                    return i;
                if (isPalindrome(str, i, j - 1))
                    return j;
                return -1;
            }
        }

        return -2;
    }

    public static void main(String[] args) {
        String str = "aabbcaa";
         //i = 2, j =4
        // i=3, bc
        int index = possiblePaulinDomeByRemovingOneChar(str);

        System.out.println(index);
    }

}