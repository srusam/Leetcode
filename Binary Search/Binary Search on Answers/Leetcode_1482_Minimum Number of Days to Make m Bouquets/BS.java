class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        //Edge case: If we need more flowers than there are in the garden, we cannot make the bouquet.
        if((long)m*k > n){
            return -1;
        }

        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();

        while(low <= high){
            int mid = low + (high-low)/2;

            int totalB = howManyB(bloomDay, mid, k);
            
            if(totalB < m){
                low = mid+1;
            }

            else{
                high = mid-1;
            }
        }

        return low;
        
    }

    public static int howManyB (int[] bloomDay, int mid, int k){
        
        int n = bloomDay.length;
        int count = 0;
        int B = 0;

        for(int i=0; i<n; i++){
            
            if(bloomDay[i] <= mid){
                count++;

                if(count==k){
                    count = 0;
                    B++;
                }
            }
            else{
                count = 0;
            }
        }

        return B;

    }
}
