class Solution {
    public int[] findPeakGrid(int[][] mat) {
        
        int n = mat.length;
        int m = mat[0].length;

        int low = 0; //first col
        int high = m-1; //last col

        while(low <= high){

            int mid = low + (high - low)/2; //again a col

            //find the max element in the col and return the index of the row it is in.
            /*we get this max so that we don't have to check for the element to be
            greater than the top and bottom. Also, this is the best probability 
            that the max element is our answer.
            */
            int maxRowIdx = findEleMaxRowIndex(mat, n, m, mid);

            //get the left and right elements. -1 if there are none.
            
            int left = mid-1 >= 0 ? mat[maxRowIdx][mid-1] : -1;
            int right = mid+1 <= m-1 ? mat[maxRowIdx][mid+1] : -1;

            //finally check with left and right.
            
            if(mat[maxRowIdx][mid] > left && mat[maxRowIdx][mid] > right){
                return new int[]{maxRowIdx, mid};
            }

            //left side is bigger than the current. Eliminate right part
            else if(mat[maxRowIdx][mid] < left){
                high = mid - 1;
            } 

            else{
                low = mid + 1;
            }
        }

        return new int[] {-1,-1};
    }   

    public int findEleMaxRowIndex(int[][] mat, int n, int m, int col){

        int maxEle = -1;
        int index = -1;

        for(int i=0; i<n; i++){

            if(mat[i][col] > maxEle){
                maxEle = mat[i][col];
                index = i;
            }
        }

        return index;
    }
}
