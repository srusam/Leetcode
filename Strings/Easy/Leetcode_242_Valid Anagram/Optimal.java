class Solution {
    public boolean isAnagram(String s, String t) {
        
        int n = s.length();
        int m = t.length();

        //string length not equal then not an anagram
        if(n != m){
            return false;
        }

        //create an array of size 26 for the 26 alphabets
        int[] arr = new int[26]; //initially 0 value

        //increment the corresponding values for the characters in s
        for(int i=0; i<n; i++){

            char c = s.charAt(i);

            arr[c-'a']++;
        }

        //decrement the corresponding values for the characters in t
        for(int i=0; i<m; i++){

            char c = t.charAt(i);

            arr[c-'a']--;
        }

        /*
            if all the characters are the same in s and t
            if all the characters are used the same number of times in s and t
            then ideally th array should again now be 0 to be anagram
        */
        for(int i=0; i<26; i++){
            
            if(arr[i] != 0){
                return false;
            }
        }

        return true;
    }
}

//TC: O(n)
//SC: O(1) .... array size is fixed
