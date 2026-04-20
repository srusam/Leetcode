class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low<high){
            int mid = low + (high-low)/2;

            //move right
            if(nums[mid] > nums[high]){
                low = mid+1;
            }
            //move left
            else{
                high = mid;
            }
        }

        return nums[low];
    }
}
