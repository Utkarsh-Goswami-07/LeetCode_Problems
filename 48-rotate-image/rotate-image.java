class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) { 
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < rows; i++) {
            reverse(matrix,i);
        }
    }

    private void reverse(int[][] arr, int row){
        int col = arr[0].length;
        int left = 0;
        int right = col - 1;
        
        while (left < right) {
            int temp = arr[row][left];
            arr[row][left] = arr[row][right];
            arr[row][right] = temp;
            left++;
            right--;
        }
    }
}