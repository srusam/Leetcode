class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        //length of the string array
        int n = strs.length;

        String first = strs[0];
        int fn = first.length();

        //iterating over the characters of the first string
        for(int i=0; i<fn; i++){

            //current character of the first string
            char ch = first.charAt(i);

            //iterating over each string in the string array and comparing
            //the ith character with ch
            for(int j=1; j<n; j++){

                //if the current string ends or character mismatches
                if(strs[j].length() <= i || strs[j].charAt(i) != ch){
                    return first.substring(0,i);
                }
            }
        }

        //if there is no mismatch 
        return first;

    }
}

//O(mn)
