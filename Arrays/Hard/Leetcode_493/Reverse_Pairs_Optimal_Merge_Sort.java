class Solution {

    public int reversePairs(int[] nums) {

        int n = nums.length;
        return mergeSort(nums, 0, n-1);

    }

    private int mergeSort(int[] arr, int low, int high){
        
        if(low >= high){
            return 0;
        }

        int mid = low + (high-low)/2;
        int count = 0;

        //count the left part
        count = count + mergeSort(arr, low, mid);
        //count the right part
        count = count + mergeSort(arr, mid+1, high);
        //count the crosspairs
        count = count + crossPairs(arr, low, mid, high);

        merge(arr, low, mid, high);

        return count;
    }

    private int crossPairs(int[] arr, int low, int mid, int high){

        int count = 0;
        int right = mid+1;

        //traversing the left array
        for(int i=low; i<=mid; i++){

            while( right<=high && arr[i] > 2L*arr[right]){
                right++;
            }

            //Answer is from mid+1 to right-1
            //count = count + right - 1 - (mid+1) + 1
            //count = count + right - 1 - mid - 1 + 1 = count + right - (mid+1)
            count = count + right - (mid+1);

        }
        return count;
    }

    private void merge(int[] arr, int low, int mid, int high){

        int n = high - low + 1;

        int[] temp = new int[n];

        //for traversing the left array
        int left = low;
        //for traversing the right array
        int right = mid+1;
        //pointer to the temp array indexes
        int k = 0;

        while(left<=mid && right<=high){

            if(arr[left] <= arr[right]){
                temp[k] = arr[left];
                k++;
                left++;
            }
            else{
                temp[k] = arr[right];
                k++;
                right++;
            }
        }

        //remaining elements
        while(left<=mid){
            temp[k] = arr[left];
            k++;
            left++;
        }

        while(right<=high){
            temp[k] = arr[right];
            k++;
            right++;
        }

        //copy to the original array
        for(int i=0; i<temp.length; i++){
            arr[low+i] = temp[i];
        }
        
        return;
    }
}
