class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;

        Set<List<Integer>> finalSet = new HashSet<>();

        for(int i=0; i<n; i++){
            
            for(int j=i+1; j<n; j++){

                Set<Integer> set = new HashSet<>();

                for(int k=j+1; k<n; k++){
                    
                long fourth = (long) target - ((long) nums[i] + nums[j] + nums[k]);
                    if(fourth>=Integer.MIN_VALUE && fourth<=Integer.MAX_VALUE){
                        if(set.contains((int) fourth)){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add((int) fourth);
                        Collections.sort(list);
                        finalSet.add(list);
                    }
                    }

                    set.add(nums[k]);
                }
            }
        }
        return new ArrayList<>(finalSet);
    }
}
