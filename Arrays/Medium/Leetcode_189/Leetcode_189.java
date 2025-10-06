class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        /*
        Normalize k
        If we consider an array 1,2,3,4,5,6,7
        For k=101, the 100th rotation will again give
        1,2,3,4,5,6,7
        Hence, to normalize k in order to reduce the 
        unnecessary rotation, we normalize it.
        */
        k = k%n;
        /*
        Handling the negative values.
        If the size of the array is n=7 and k=-1
        k = -1+7=6 i.e 6 shifts.
        */
        if(k<0){
            k = k + n;
        }
        //Reverse the first elements before the last k elements
        reverse(nums, 0, n-k-1);
        //Reverse the last k elements
        reverse(nums, n-k, n-1);
        //Reverse the entire array
        reverse(nums, 0, n-1);
    }

    public void reverse(int[] nums, int i, int j){
        int start = i;
        int end = j;
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            
            start++;
            end--;
        }
    }
}
