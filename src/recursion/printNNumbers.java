//print 1 to n numbers using recursion;
//IBH -> Induction ,Base ,Hypothesis
package recursion;

public class printNNumbers {
    public static void main(String[] args) {
        final int i = 1;
        final int n = 9;
        //printN(i, n);
        printN2(n);
    }

    private static void printN2(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printN2(n - 1);
        System.out.println(n);

    }

    private static void printN(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        printN(i + 1, n);
    }
}
