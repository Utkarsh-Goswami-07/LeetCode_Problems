class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int res = 0, sum = 0;

        mp.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int key = sum - k;
            if (mp.containsKey(key)) {
                res += mp.get(key);
            }
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }

        return res;
    }
}