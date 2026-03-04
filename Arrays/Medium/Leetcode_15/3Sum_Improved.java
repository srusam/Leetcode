class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i<n; i++){
            Set<Integer> tempSet = new HashSet<>();

            for(int j=i+1; j<n; j++){
                int third = -(nums[i] + nums[j]);

                if(tempSet.contains(third)){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(third);
                    Collections.sort(list);
                    set.add(list);
                }

                tempSet.add(nums[j]);
            }
        }

        return new ArrayList<>(set);
    }
}
