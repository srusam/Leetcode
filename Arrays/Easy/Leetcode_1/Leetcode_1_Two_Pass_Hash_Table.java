class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            //map(key,value)
            map.put(nums[i], i);
        }
        for(int i=0; i<n; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                result[0] = i;
                result[1] = map.get(complement);
                return result;
            }
        }
        return result;
    }
}
