class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        int case1 = robRange(nums, 0, n - 2);
        int case2 = robRange(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    private int robRange(int[] nums, int start, int end) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);

        return rec(nums, start, end, memo);
    }

    private int rec(int[] nums, int i, int end, int[] memo) {
        if (i > end) return 0;

        if (memo[i] != -1) return memo[i];

        int take = nums[i] + rec(nums, i + 2, end, memo);
        int skip = rec(nums, i + 1, end, memo);

        return memo[i] = Math.max(take, skip);
    }
}