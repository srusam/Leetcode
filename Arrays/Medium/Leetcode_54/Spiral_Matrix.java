class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        //dimensions
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;    //first row
        int bottom = m-1;   //last row
        int left = 0;   //first column
        int right = n-1;    //last column

        List<Integer> list = new ArrayList<>();

        while(top<=bottom && left<=right){

            //traverse current top row from left to right
            for(int i=left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;

            //traverse current right column from top to bottom
            for(int i=top; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;

            //traverse current bottom row from right to left
            //condition for if a bottom row is left untraversed
            if(top<=bottom){
                 for(int i=right; i>=left; i--){
                    list.add(matrix[bottom][i]);
                 }
                bottom--;
            }
           
            //traverse current left row from bottom to top
            //condition for if a left row is left untraversed
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}
