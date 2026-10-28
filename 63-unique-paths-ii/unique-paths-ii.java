class Solution {
    int[][] memo;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        memo = new int[m][n];
        
        for (int[] rows : memo) {
            Arrays.fill(rows, -1);
        }

        return findingPaths(obstacleGrid, 0, 0, m, n);
    }

    private int findingPaths(int[][] obstacleGrid, int row, int col, int m, int n) {
        if (row >= m || col >= n) return 0;
        if (obstacleGrid[row][col] == 1) return 0;
        if (row == m - 1  &&  col == n - 1) return 1; 

        if (memo[row][col] != -1) return memo[row][col];

        int right = findingPaths(obstacleGrid, row, col + 1, m, n);
        int down = findingPaths(obstacleGrid, row + 1, col, m, n);

        return memo[row][col] = right + down;
    }
}