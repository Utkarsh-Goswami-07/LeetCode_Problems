class Solution {
    int[] memo;
    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);

        return rec(nums, 0);
    }

    private int rec(int[] nums, int i) {
        if (i >= nums.length) return 0;

        if (memo[i] != -1) return memo[i];
        int take = nums[i] + rec(nums, i + 2);
        int skip = rec(nums, i + 1);

        return memo[i] =  Math.max(take, skip);
    }
}