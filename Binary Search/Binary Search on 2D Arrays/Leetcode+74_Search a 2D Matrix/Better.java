class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n = matrix.length; //rows
        int m = matrix[0].length; //columns

        //Applying binary search on each row individually one by one
        
        for(int i=0; i<n; i++){ //Go to each row one by one

            int low = 0; //first element of the row (first column)
            int high = m-1; //last element of the row (last column)

            
            while(low <= high){ //Binary search in that row (on the columns)

                int mid = low + (high-low)/2;

                if(target == matrix[i][mid]){
                    return true;
                }

                else if(target < matrix[i][mid]){
                    high = mid - 1;
                }

                else{
                    low = mid + 1;
                }
            }
        }

        return false;
    }
}

//O(n*logm)
