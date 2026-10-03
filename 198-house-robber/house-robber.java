class Solution {
    int[] memo;
    public int rob(int[] nums) {
        int n = nums.length;
        memo = new int[n];
        Arrays.fill(memo, -1);

        return robberyPlanning(0, nums);        
    }
    private int robberyPlanning(int pos, int[] nums) {
        if (pos >= nums.length) return 0;

        if (memo[pos] != -1) return memo[pos];

        int rob = nums[pos] + robberyPlanning(pos + 2, nums);
        int skip = robberyPlanning(pos + 1, nums);

        return memo[pos] = Math.max(rob, skip);
    }
}