class Solution {
    public int rowWithMax1s(int[][] mat) {
       int n = mat.length;
       int m = mat[0].length;

       int max1 = 0;
       int index = -1;

       for(int i=0; i<n; i++){
            int count1 = m - lowerboundOf1(mat[i], m, 1);

            if(count1 > max1) //not >= because if more than 1 rows have the same number of max 1, we have to written the min index that would occur first.
            {
                max1 = count1;
                index = i; //return the row number
            }
       }

       return index;
    }

    /*
    [0 1 2 3 4]
    [0,0,1,1,1]

    lowerbound(1) = 2
    upperbound(0) = 2
    first occurence(1) = 2
    */

    public int lowerboundOf1(int[] row, int m, int target){

        int low = 0;
        int high = m-1;
        
        int ans = m;

        while(low <= high){
            
            int mid = low + (high-low)/2;

            if(row[mid] >= target){
                ans = mid; //might be
                high = mid - 1;
            }

            else{
                low = mid + 1;
            }
        }

        return ans;
    }
}

//Time complexity: O(n*logm)
//Space complexity: O(1)
//base is 2
