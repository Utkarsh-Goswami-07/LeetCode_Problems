class Solution {
    int[] memo;
    public int minCostClimbingStairs(int[] cost ) {
        int n = cost.length; 
        memo = new int[n];
        Arrays.fill(memo, -1);
        int finalCost = Math.min(rec(cost, n - 1), rec(cost, n - 2));

        return finalCost;
    }

    private int rec(int[] cost, int n)  {
        if (n < 0) return 0;
        if (n == 0  ||  n == 1) return cost[n];
        if (memo[n] != -1) return memo[n];
        memo[n] = cost[n] + Math.min(rec(cost, n - 1), rec(cost, n - 2));

        return memo[n];
    }
}