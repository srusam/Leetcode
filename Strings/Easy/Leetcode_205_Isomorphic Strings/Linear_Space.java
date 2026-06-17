class Solution {
    public boolean isIsomorphic(String s, String t) {

        int n = s.length();
        
        /*
        create 2 arrays, each of length 256.
        256 because a char in java can be treated as integer.
        We assume that the char belong to the ASCII set.
        The standard has 128 values, extended as 256.

        Initially, the arrays are empty. So all the values are 0.
        */
        int[] sMap = new int[256];
        int[] tMap= new int[256];

        //iterating over the strings
        for(int i=0; i<n; i++){
            
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            /*
                arr[1] where 1 is an integer gives the element at that position.
                arr[e] where e is a character is treated as
                arr[101] because the ASCII value of e is 101
                So, it gives the element at that position.

                We are incrementing the appearance by 1. 
                The array stores the last position where the element was seen.
                So what we are getting from arr[c] is the number of apperance together
            */

            if(sMap[c1] != tMap[c2]){
                return false;
            }

            sMap[c1] = i+1;
            tMap[c2] = i+1;
        }

        return true;
    }
}

//TC: O(n)
//SC: O(1) we created fixed size arrays
