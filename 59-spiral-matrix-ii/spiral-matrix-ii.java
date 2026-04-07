class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        
        int count = 1;
        int left = 0, right = n - 1;
        int top = 0, bottom = n - 1;

        while (top <= bottom && left <= right) {

            // left → right
            for (int i = left; i <= right; i++) {
                res[top][i] = count;
                count++;
            }
            top++;

            // top → bottom
            for (int i = top; i <= bottom; i++) {
                res[i][right] = count;
                count++;
            }
            right--;

            // right → left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res[bottom][i] = count;
                    count++;
                }
                bottom--;
            }

            // bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res[i][left] = count;
                    count++;
                }
                left++;
            }
        }

        return res;
    }
}