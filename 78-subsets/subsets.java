class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> res = new ArrayList<>();
       List<Integer> ans = new ArrayList<>();
       rec(nums, 0, nums.length, ans, res);
       return res;
    }
    private void rec(int[] nums, int index,int n, List<Integer> ans, List<List<Integer>> res) {
        if (index == n) {
            res.add(new ArrayList<>(ans));
            return;
        }

        rec(nums, index + 1, n, ans, res) ; //notTake
        ans.add(nums[index]);
        rec(nums, index + 1, n, ans, res);  // Take
        ans.remove(ans.size() - 1);
    }

}
