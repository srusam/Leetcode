class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;

        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();

        while(low <= high){
            int mid = low + (high-low)/2;

            int numSub = howManySubArrays(nums, mid);

            if(numSub > k){
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }
        return low;
    }

    public int howManySubArrays(int[] arr, int maxSum){
        int n = arr.length;

        int sum = 0;
        int numSub = 1;

        for(int i=0; i<n; i++){

            if(sum + arr[i] <= maxSum){
                sum = sum + arr[i];
            }

            else{
                numSub++;
                sum = arr[i];
            }
        }

        return numSub;
    }
}
