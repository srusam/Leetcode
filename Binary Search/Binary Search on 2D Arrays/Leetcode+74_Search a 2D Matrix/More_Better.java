class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n; i++){

            if(matrix[i][0] <= target && target <= matrix[i][m-1]){
                return binarySearch(matrix[i], target);
            }
        }

        return false;
    }

    public boolean binarySearch(int[] row, int target){
        
        int n = row.length;

        int low = 0;
        int high = n-1;

        while(low <= high){

            int mid = low + (high-low)/2;

            if(target == row[mid]){
                return true;
            }

            else if(target < row[mid]){
                high = mid - 1;
            }

            else{
                low = mid + 1;
            }
        }

        return false;
    }
}

//O(n*logm)
