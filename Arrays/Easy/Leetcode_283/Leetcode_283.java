class Solution {
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int j = 0;

        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                nums[j] = nums[i];
                j++;
            }
        }

        for(int i=j; i<n; i++){
            nums[i] = 0;
        }
    }
}
/*
j=0     i=0     0,1,0,3,12      skip
j=0     i=1     0,1,0,3,12      1,1,0,3,12      j=1
j=1     i=2     1,1,0,3,12      skip
j=1     i=3     1,1,0,3,12      1,3,0,3,12      j=2
j=2     i=4     1,3,0,3,12      1,3,12,3,12     j=3

Number of non-zero elements = j = 3
Put 0 from j to n-1.
*/
