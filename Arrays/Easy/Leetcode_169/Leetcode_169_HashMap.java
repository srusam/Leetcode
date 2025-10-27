class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int maximum = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            if(count>n/2){
                maximum = entry.getKey();
            }
        }
        return maximum;
    }
}
