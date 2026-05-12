class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n = matrix.length;
        int m = matrix[0].length;

        //start from top-right corner
        int row = 0;
        int col = m-1;

        while(row<n && col>=0){

            if(target == matrix[row][col]){
                return true;
            }

            else if(target < matrix[row][col]){
                col--; //move left
            }

            else{
                row++; //move down
            }
        }

        return false;
    }
}

//if target is smaller than the mid element, go to left. (sorted row)
//If greater, go down. (sorted column)

//O(m+n)
