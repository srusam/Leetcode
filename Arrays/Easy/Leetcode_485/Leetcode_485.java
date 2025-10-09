class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = Integer.MIN_VALUE;
        int temp = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==1){
                temp++;
            }
            else{
                count = Math.max(count, temp);
                temp = 0;
            }
        }
        count = Math.max(count, temp);
        return count;
    }
}
