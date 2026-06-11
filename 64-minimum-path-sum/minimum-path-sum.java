class Solution {
    int[][] memo;
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        memo = new int[m][n];
        for (int[] rows : memo) {
            Arrays.fill(rows, -1);
        }

        return minPath(0, 0, m, n, grid);
    }

    private int minPath(int row, int col, int m, int n, int[][]grid) {
        if (row >= m  ||  col >= n) return Integer.MAX_VALUE;
        if (row == m - 1  && col == n - 1) return grid[row][col];

        if (memo[row][col] != -1) return memo[row][col];

        int down = minPath(row + 1, col, m, n, grid);
        int right = minPath(row, col + 1, m, n, grid);

        return memo[row][col] = grid[row][col] + Math.min(right, down);
    }
}