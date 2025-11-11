class Solution {
    public int[] rearrangeArray(int[] nums) {

        int len = nums.length;

        int[] arr = new int[len];

        int p=0;
        int n=0;
        int i=0;
        boolean pf = false;
        boolean nf = true;

        while(i<len){
            
            if(pf == false){
                if(nums[p] < 0){
                    p++;
                }
                else{
                    arr[i] = nums[p];
                    i++;
                    pf = true;
                    nf = false;
                    p++;
                }
            }
            else{
                if(nums[n] > 0){
                    n++;
                }
                else{
                    arr[i] = nums[n];
                    i++;
                    nf = true;
                    pf = false;
                    n++;
                }
            }
        }

        return arr;

    }
}

/*
 0  1  2   3   
-1, 1, 3, -2, 

p=0, n=0, i=0, nf = true, pf = false

if pf = false
nums[p] < 0
p=1, n=0

if pf = false
nums[p] > 0
arr[i] = nums[p]    1
i++ 
pf = true
nf = false
p=2, n=0

if nf = false
nums[n] < 0
arr[i] = nums[n]    1,-1
i++
nf = true
pf = false
n=1, p=2

if pf = false
nums[p] > 0
arr[i] = nums[p]    1,-1,3
i++
pf = true
nf = false
p=3, n=1

if nf = false
nums[n] > 0
p=3, n=2

if nf = false
nums[n] > 0
p=3, n=3

if nf = false
nums[n] < 0
i++
arr[i] = nums[n]    1,-1,3,-2
p=3, n=4

n>nums.length -> end
*/
