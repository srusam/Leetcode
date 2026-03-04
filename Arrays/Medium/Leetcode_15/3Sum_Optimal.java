class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<n; i++){
            
            //Skip duplicates
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int L = i+1;
            int R = n-1;

            while(L<R){
                int sum = nums[i]+nums[L]+nums[R];

                if(sum==0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    res.add(list);
                    L++;
                    R--;

                    while(L<R && nums[L]==nums[L-1]){
                        L++;
                    }

                    while(L<R && nums[R]==nums[R+1]){
                        R--;
                    } 
                }
                else if(sum<0){
                    L++;
                }
                else{
                    R--;
                }
            }
        }
        return res;
    }
}
