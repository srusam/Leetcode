class Solution {
    public int longestConsecutive(int[] nums) {

        //  Length of the array
        int n = nums.length;

        // Set
        Set<Integer> set = new HashSet<>();

        //Fill up the set with the array elements
        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }

        //Length of the longest consecutive sequence
        int maxCount = 0;

        //Iterating over the set
        for(int num : set){
            /*Start condition:
            The current num is the first in the sequence
            This means that the previous num is not in the set*/
            if(!set.contains(num-1)){
                int count = 1;
                int next = num+1;

                while(set.contains(next)){
                    count++;
                    next++;
                }

                maxCount = Math.max(count, maxCount);
            }

        }

        return maxCount;

    }
}
