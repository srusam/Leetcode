class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        //Put the key(number) and value(count) in the map
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        //Number of 0's
        int s0 = map.getOrDefault(0,0);
        //Number of 1's
        int s1 = map.getOrDefault(1,0);
        //Number of 2's
        int s2 = map.getOrDefault(2,0);
        //Insert 0's
        for(int i=0; i<s0; i++){
            nums[i] = 0;
        }
        //Insert 1's
        for(int i=s0; i<s0+s1; i++){
            nums[i] = 1;
        }
        //Insert 2's
        for(int i=s0+s1; i<s0+s1+s2; i++){
            nums[i] = 2;
        }
    }
}
