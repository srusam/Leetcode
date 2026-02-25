class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] r0 = new boolean[m];
        boolean[] c0 = new boolean[n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    r0[i] = true;
                    c0[j] = true;
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(r0[i] || c0[j]){
                    matrix[i][j] = 0;
                }
            }
        }

        return;
    }
}
