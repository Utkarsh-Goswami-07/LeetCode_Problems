class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) set.add(num);

        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                list.add(num);
                set.remove(num);
            }
        }

        int start = 0;
        int[] res = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            res[start++] = num;
        }

        return res;
    }
}