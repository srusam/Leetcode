class Solution {
    public boolean isPalindrome(int x) {
        
        int n = x;
        int reversed = 0;

        //Handling negative values
        if(n<0){
            return false;
        }

        //Handling zero
        else if(n==0){
            return true;
        }

        //Handling positive values
        else{
            
            //Reversing the number
            while(n!=0){
                int lastDigit = n%10;
                reversed = reversed*10 + lastDigit;
                n = n/10;
            }

        }

        //Checking if the given number and reversed number are equal and returning true or false accordingly
        return x==reversed;
    }
}
