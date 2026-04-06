class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        for(int i=0; i<n-1; i++){
            
            if(nums[i]>nums[i+1]){

                if(nums[0]<=target){
                    return binarySearch(nums, 0, i, target);
                }

                else if(nums[i+1]<=target){
                    return binarySearch(nums, i+1, n-1, target);
                }
                
                break;
            }
        }
        
        return binarySearch(nums,0,n-1,target);
    }

    public int binarySearch(int[] nums, int low, int high, int target){
        
        while(low<=high){
            
            int mid = low + (high-low)/2;

            if(target == nums[mid]){
                return mid;
            }
            else if(target<=nums[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return -1;
    }
}
