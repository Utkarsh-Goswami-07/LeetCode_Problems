class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int robbery1 = robRange(nums, 0, n - 2);
        int robbery2 = robRange(nums, 1, n - 1);

        return Math.max(robbery1, robbery2);
    }
    private int robRange(int[] nums, int start, int end) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);

        return robbery(nums, start, end, memo);
    }

    private int robbery(int[] nums, int pos, int end, int[] memo) {
        if (pos > end) return 0;
        if (memo[pos] != -1) return memo[pos];

        int rob = nums[pos] + robbery(nums, pos + 2, end, memo);
        int leave = robbery(nums, pos + 1, end, memo);

        return memo[pos] = Math.max(rob, leave);
    }
}