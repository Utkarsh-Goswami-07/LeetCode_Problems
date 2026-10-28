class Solution {
    int[] memo;
    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);

        return robbery(nums, 0);
    }

    private int robbery(int[] nums, int pos) {
        if (pos >= nums.length) return 0;
        if (memo[pos] != -1) return memo[pos];

        int rob = nums[pos] + robbery(nums, pos + 2);
        int leave = robbery(nums, pos + 1);

        return memo[pos] = Math.max(rob, leave);
    }
}