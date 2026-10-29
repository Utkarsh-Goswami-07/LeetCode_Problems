class Solution {
    int[][] memo;
     public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        memo = new int[m][n];
        for (int[] rows : memo) 
            Arrays.fill(rows, -1);

        return minPath(grid, 0, 0, m, n);
    }

    private int minPath(int[][] grid, int row, int col, Integer m, Integer n) {
        if (row >= m  ||  col >= n) return Integer.MAX_VALUE;
        if (row == m - 1  &&  col == n - 1) return grid[row][col];

        if (memo[row][col] != -1) return memo[row][col];

        int down = minPath(grid, row + 1, col, m, n);
        int right = minPath(grid, row, col + 1, m, n);
        
        return memo[row][col] = grid[row][col] + Math.min(down, right);
    }
}