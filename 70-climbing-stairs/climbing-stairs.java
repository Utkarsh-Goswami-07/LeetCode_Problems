class Solution {
    int[] memo = new int[46];
    private int rec(int n) {
        if (n == 0  ||  n == 1) return 1;
        
        if(memo[n] != -1) return memo[n];
        return memo[n] = rec(n - 1) + rec(n - 2);
    }

    public int climbStairs(int n) {
       Arrays.fill(memo, -1);
       return rec(n);
    }
}