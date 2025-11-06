class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int maxTillNow = nums[0];
        int overallMax = nums[0];

        //nums==null checks if an array object exists at all.
        //nums.length==0 checks if the array is empty
        if(nums==null || nums.length==0){
            return 0;
        }

        for(int i=1; i<n; i++){
            
            //Option 1: Start a new array if the new sum is a liability
            //Option 2: Continue the subarray if the new sum is greater than the new term
            maxTillNow = Math.max(nums[i], maxTillNow + nums[i]);

            //Update the overall max
            overallMax = Math.max(maxTillNow, overallMax);
        }

        return overallMax;
    }
}
