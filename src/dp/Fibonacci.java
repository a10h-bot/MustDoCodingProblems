//Fibonacci sequence using reccursion and memoization

package dp;

import java.util.HashMap;
import java.util.Map;

//0,1,1,2,3,5,8,13,21,34
public class Fibonacci {
    public static void main(final String[] args) {
        System.out.println(fib(2));
        System.out.println(fib(10));
        System.out.println(fib(150));
    }
    // solution using map as memoization storage
    private static int fib(final int n) {
        return fib(n, new HashMap<Integer, Integer>());
    }

    private static int fib(final int n, final HashMap<Integer, Integer> memo) {
        if (n < 0) throw new IllegalArgumentException("Negative argument passed!");
        else if (n <= 2) return n;
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = fib(n - 1, memo) + fib(n - 2, memo);
        memo.put(n, result);
        return result;
    }

    // solution using Array as memoization storage
    private static int fibonacci(final int n) {
        return fibonacci(n, new int[n + 1]);
    }

    static int fibonacci(final int i, final int[] memo) {
        if (i == 0 || i == 1) return i;

        if (memo[i] == 0) {
            memo[i] = fibonacci(i - 1, memo) + fibonacci(i - 2, memo);
        }
        return memo[i];
    }
}




