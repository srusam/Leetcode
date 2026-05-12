class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n = matrix.length;
        int m = matrix[0].length;

        boolean res = false;

        for(int i=0; i<n; i++){
            
            if(matrix[i][0] <= target && target <= matrix[i][m-1]){
                res = binarySearch(matrix[i], target);

                if(res){
                    return true;
                }
            }
        } 

        return res;
    }

    public boolean binarySearch(int[] row, int target){

        int n = row.length;

        int low = 0;
        int high = n-1;

        while(low <= high){
            
            int mid = low + (high-low)/2;

            if(row[mid] == target){
                return true;
            }

            else if(row[mid] < target){
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }

        return false;
    }
}

//O(n*logm)
