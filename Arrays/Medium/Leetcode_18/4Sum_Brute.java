class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<n-3; i++){
            for(int j=i+1; j<n-2; j++){
                for(int k=j+1; k<n-1; k++){
                    for(int m=k+1; m<n; m++){
                        int sum = nums[i]+nums[j]+nums[k]+nums[m];
                        if(sum==target){
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            list.add(nums[m]);
                            Collections.sort(list);
                            set.add(list);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
