class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        int sum = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                sum = nums[j]+nums[i];
                if(sum==target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
            
        }
        return arr;
    }
}
