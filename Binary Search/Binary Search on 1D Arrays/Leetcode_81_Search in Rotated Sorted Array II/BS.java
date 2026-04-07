class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;

        int low = 0;
        int high = n-1;

        while(low <= high){

            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                return true;
            }
            
            //handling duplicates
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
            }

            //if left part is sorted
            else if(nums[low] <= nums[mid]){
                //if target lies in the range of the left part
                if(nums[low]<=target && target<=nums[mid]){
                    high = mid-1;
                }
                //if targer does not lie in the range of the left part
                else{
                    low = mid+1;
                }
            }
            //if right part is sorted
            else{
                //if target lies in the range of the right part
                if(nums[mid]<=target && target<=nums[high]){
                    low = mid+1;
                }
                //if target does not lie in the range of the right part
                else{
                    high = mid-1;
                }
            }
        }

        return false;
    }
}
