class Solution {
    int[] dp = new int[31];
    public int fib(int n) {
        if (dp[n] != 0) return dp[n];
        if (n <= 1) return n;

        dp[n] = fib(n - 1) + fib(n - 2);
        return dp[n];
    }
}