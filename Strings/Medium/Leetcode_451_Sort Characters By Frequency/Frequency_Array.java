class Solution {
    public String frequencySort(String s) {
        int n = s.length();

        StringBuilder sb = new StringBuilder();

        int[] freq = new int[128];  //ASCII (0-9,a-z,A-Z) 128 enough
        //In a freq array, idx:ascii values, value:frequency

        //Initially all the values are 0. So update the frequencies
        for(int i=0; i<n; i++){

            char c = s.charAt(i);
            freq[c]++;

        }

        //sb should be the size of n because we are just sorting
        while(sb.length() < n){

            //index pointing to the current max frequency
            int idxMax = 0;

            //get the over maximum frequency element's ASCII Value (index)
            for(int i=1; i<128; i++){

                if(freq[i] > freq[idxMax]){
                    idxMax = i;
                }
            }

            //append to sb. freq[idxMax] represents how many times we have to append
            for(int i=0; i<freq[idxMax]; i++){
                
                //remember that idxMax is an index as well as the ASCII value of the character. We again have to turn it back to char
                sb.append( (char) idxMax);
            }

            //set the freq back to 0 else the same element will be flagged as max again and again
            freq[idxMax] = 0;
        }

        return sb.toString();
    }
}

//TC: O(N)
//SC: O(1)
