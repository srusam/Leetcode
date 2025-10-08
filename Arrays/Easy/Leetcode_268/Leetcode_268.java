class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int res = 0;
        for(int i=0; i<n; i++){
            res = res + nums[i];
        }
        return sum-res;
    }
}
