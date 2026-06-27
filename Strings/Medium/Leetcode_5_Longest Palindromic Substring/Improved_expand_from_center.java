class Solution {

    int start = 0;
    int maxLen = 0;

    public String longestPalindrome(String s) {
        
        int n = s.length();

        if(n<=1){
            return s;
        }

        for(int i=0; i<n; i++){

            //odd length palindrome
            expandFromCenter(s, i, i);

            //even length palindrome
            expandFromCenter(s, i, i+1);
        }

        return s.substring(start, start+maxLen);
    }

    public void expandFromCenter(String s, int L, int R){

        int n = s.length();

        while(
            L>=0 &&
            R<n &&
            s.charAt(L) == s.charAt(R) //mirrors around the center
        ){

            L--; //expanding
            R++;
        }

        //finding the length of the palindrome
        int len = R-L-1; //because we have extra values of L--, R++

        if(len>maxLen){
            maxLen = len;
            start = L+1; //because L is one extra back
        }
    }
}

//TC: O(n^2)
//SC: O(1)
