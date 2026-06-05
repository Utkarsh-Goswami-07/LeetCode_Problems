class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int task : tasks) mp.put(task, mp.getOrDefault(task, 0) + 1);

        int res = 0;

        for (int ops : mp.values()) {
            if (ops == 1) return -1;

            if (ops % 3 == 0) res += ops / 3;
            else res += (ops / 3) + 1;
        }

        return res;
    }
}