class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int maxProd = nums[0];

        for(int i=0; i<n; i++){
            
            int prod = nums[i];
            maxProd = Math.max(maxProd, prod);

            for(int j=i+1; j<n; j++){
                
                prod = prod*nums[j];
                maxProd = Math.max(maxProd, prod);

            }
        }
        
        return maxProd;
    }
}
