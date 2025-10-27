class Solution {
    public int majorityElement(int[] nums) 
    {
        int n = nums.length;
        int current = nums[0];
        int count = 1;
        for(int i=1; i<n; i++)
        {
            if(nums[i] == current)
            {
                count++;
            }
            else
            {
                count--;
                if(count < 0)
                {
                    current = nums[i];
                    count = 1;
                }
            }
        }
        return current;
    }
}
