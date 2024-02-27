class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        if (n == 0) {
            return false;  // Matrix is empty, target cannot be found
        }

        int m = matrix[0].length;

        // Perform a binary search on each row
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] <= target && target <= matrix[i][m - 1]) {
                // If the target may exist in this row, perform binary search on this row
                if (binarySearch(matrix[i], target)) {
                    return true;  // Target found
                }
            }
        }

        return false;  // Target not found in the matrix
    }

    private boolean binarySearch(int[] row, int target) {
        int left = 0;
        int right = row.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (row[mid] == target) {
                return true;  // Target found
            } else if (row[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;  // Target not found in this row
    }
}
