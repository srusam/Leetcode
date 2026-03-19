class Solution {
    public int reversePairs(int[] nums) {

        int n = nums.length;
        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] > 2L*nums[j]){//if(nums[i] > (long) 2*nums[j]){
                    count++;
                }
            }
        }

        return count;
    }
}
