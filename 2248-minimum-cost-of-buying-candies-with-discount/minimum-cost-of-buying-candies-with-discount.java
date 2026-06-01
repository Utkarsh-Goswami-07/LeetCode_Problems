class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int minCost = 0;

        for (int i = cost.length - 1; i >= 0; i--) {
            if ((cost.length - i) % 3 != 0) minCost += cost[i];
        }

        return minCost;
    }
}