class Solution {
    public String longestPalindrome(String s) {
        
        int n = s.length();

        if(n<=1){ //if the string is empty or has a single character
            return s; //return it as it is a palindrome
        }

        int maxLen = 1; //currently the first character is the longest palindrome
        
        String maxStr = s.substring(0,1); //add that single char

        for(int i=0; i<n; i++){

            for(int j=i+maxLen; j<=n; j++){ //i+maxLen is an optimization as there is no use of searching for a string that is anyway less than maxLen

                if(j-i>maxLen && isPalindrome(s, i, j-1)){ //j-i is the length of the string. We don't do j-i+1 because j is anyway not included in the substring. So we are good to go only if the length is greater than the max len till now and if that string is a palindrome.

                maxLen = j - i;
                maxStr = s.substring(i,j);

                }
            }
        }

        return maxStr;
    }

    public boolean isPalindrome(String s, int L, int R){

        while(L<R){
            
            if(s.charAt(L) != s.charAt(R)){
                return false;
            }

            L++;
            R--;
        }

        return true;
    }
}

//TC: O(n^3)
//SC: O(1)

/*
Note that when we call isPalindrome(s.substring(i,j)) we are actually forming a new auxilliary string. Hence at that time, the SC will be O(N). That is why we are giving indexes instead.
*/
