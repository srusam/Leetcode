class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        List<Integer> list = new ArrayList<>();

        int cand1 = 0;
        int cand2 = 0;
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0; i<n; i++){
            int current = nums[i];

            if(count1>0 && cand1==current){
                count1++;
            }
            else if(count2>0 && cand2==current){
                count2++;
            }
            else if(count1==0){
                cand1 = current;
                count1 = 1;
            }
            else if(count2==0){
                cand2 = current;
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int i=0; i<n; i++){
            if(nums[i] == cand1){
                count1++;
            }
            else if(nums[i] == cand2){
                count2++;
            }
        }

        if(count1 > n/3){
            list.add(cand1);
        }
        
        if(count2 > n/3 && cand1!=cand2){
            list.add(cand2);
        }

        return list;
    }
}
