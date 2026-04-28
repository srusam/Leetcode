class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;

        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();

        while(low <= high){
            int mid = low + (high - low)/2;

            int d = howManyDays(weights, mid);

            if(d<=days){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }

    public int howManyDays(int[] weights, int shipCapacity){
        int n = weights.length;

        int daySum = 0;
        int d = 0;

        for(int i=0; i<n; i++){
            daySum = daySum + weights[i];

            if(daySum > shipCapacity){
                d++;
                daySum = 0;
                i--;
            }

            if(daySum == shipCapacity){
                d++;
                daySum = 0;
            }
        }

        if(daySum>0){
            d++;
        }

        return d;
    }
}
