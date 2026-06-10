class Solution {
    int[][] memo;
    public int uniquePaths(int m, int n) {
        memo = new int[m][n];
        for (int rows[] : memo) {
            Arrays.fill(rows, -1);
        }

        return paths(0, 0, m, n);
    }

    private int paths(int row, int col, int m, int n) {
        if (row >= m  ||  col >= n) return 0;
        if (row == m - 1  &&  col == n - 1) return 1;
        if (memo[row][col] != -1) return memo[row][col];

        int right = paths(row, col + 1, m, n);
        int down = paths(row + 1, col, m, n);

        return memo[row][col] = right + down;
    }
}