class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;

        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();

        while(low <= high){
            int mid = low + (high-low)/2;

            int sum = getSum(nums, mid);

            if(sum <= threshold){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }

    public int getSum(int[] arr, int divisor){
        int n = arr.length;
        long sum = 0;

        for(int i=0; i<n; i++){
            sum = sum + (int) Math.ceil( (double) arr[i]/divisor);
        }

        return (int) sum;
    }
}
