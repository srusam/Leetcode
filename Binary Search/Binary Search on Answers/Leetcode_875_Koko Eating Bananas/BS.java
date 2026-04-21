class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        //maximum number of bananas in a pile will be considered to be the maximum bananas eaten in an hour
        int maxBananas = Arrays.stream(piles).max().getAsInt();

        //We need to find k so we will set high and low as the minimum and maximum possible values of k.
        int low = 1;
        int high = maxBananas;

        //We know about the polarity concept in binary search. High always ends behind the answer while low ends on the answer. Hence, there is no need to store the possible results in a variable. We can just return low.

        while(low <= high){

            int mid = low + (high-low)/2;

            long hoursNeeded = hoursCalculator(piles, mid);

            if(hoursNeeded <= h){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return low;
    }

    public static long hoursCalculator(int[] piles, int k){
        int n = piles.length;
        long hours = 0L;
        for(int i=0; i<n; i++){
            hours = hours + (long)Math.ceil((double)piles[i]/k);
        }
        return hours;
    }
}
