class Solution {
    public void rotate(int[][] matrix) {
        // Step 1: Transpose the matrix
        transpose(matrix);

        // Step 2: Reverse each row
        reverseRows(matrix);
    }

    private void transpose(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap the elements across the main diagonal
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private void reverseRows(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;

            
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;

                start++;
                end--;
            }
        }
    }
}
