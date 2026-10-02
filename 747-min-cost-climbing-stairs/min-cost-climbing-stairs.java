class Solution {
    int[] memo;
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        memo = new int[n];
        Arrays.fill(memo, -1);
       int finalCost = Math.min(minCost(n - 1, cost), minCost(n - 2, cost));

       return finalCost;
    }

    private int minCost(int n, int[] cost) {
        if (n == 0  ||  n == 1) return cost[n];
        if (memo[n] != -1) return memo[n];
        memo[n] = cost[n] + Math.min(minCost(n - 1, cost), minCost(n - 2, cost)); 

        return memo[n];
    }
}