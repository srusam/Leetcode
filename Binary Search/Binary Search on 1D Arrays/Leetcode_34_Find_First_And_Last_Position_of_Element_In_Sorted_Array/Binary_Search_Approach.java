class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOcc(nums, target);
        //if there is no first, there is no last. So save the Logn time instead of running the function again.
        if(first == -1){
            return new int[]{-1,-1};
        }
        int last = lastOcc(nums, target);
        return new int[]{first, last};
    }

    public static int firstOcc(int[] nums, int target){
        int n = nums.length;

        int low = 0;
        int high = n-1;
        int first = -1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                first = mid;
                //to find the first occ, move on the left
                high = mid-1;
            }
            else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return first;
    }

    public static int lastOcc(int[] nums, int target){
        int n = nums.length;

        int low = 0;
        int high = n-1;
        int last = -1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                last = mid;
                low = mid+1;
            }
            else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return last;
    }
}
