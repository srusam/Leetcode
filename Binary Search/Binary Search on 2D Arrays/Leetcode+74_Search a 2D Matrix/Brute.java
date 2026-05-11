class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length; //rows
        int m = matrix[0].length; //columns

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}

//O(m*n)
