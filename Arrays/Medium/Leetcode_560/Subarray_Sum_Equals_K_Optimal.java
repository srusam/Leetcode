class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int n =  nums.length;
        int x = 0;
        int c = 0;

        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        for(int i=0; i<n; i++){
            x = x + nums[i];
            int R = x-k;
            
            if(map.containsKey(R)){
                c = c + map.get(R);
            }

            map.put(x, map.getOrDefault(x,0)+1);
        }

        return c;
    }
}
