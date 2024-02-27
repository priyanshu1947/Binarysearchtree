class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        if (n == 0) {
            return false;  // Matrix is empty, target cannot be found
        }
        for(int i =0; i<n;i++)
        {
            if(matrix[i][0]<=target && target <=matrix[i][m-1])
            {
                if(binarySearch(matrix[i], target))
                {
                    return true;
                }
            }

        }
        return false;
    }

    public boolean binarySearch( int [] row, int target)
    {
        int left =0;
        int right = row.length-1;

        while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(row[mid]== target)
            {
                return true;
            }
            else if(row[mid]<target)
            {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return false;
    }
}