class Solution {
    public int removeDuplicates(int[] nums) {
        
        int j = 0;
        
        for(int i=1; i<nums.length; i++){
            if(nums[j] != nums[i]){
                j = j+1;
                nums[j] = nums[i];
            }
        }

        return j+1;
    }
}
