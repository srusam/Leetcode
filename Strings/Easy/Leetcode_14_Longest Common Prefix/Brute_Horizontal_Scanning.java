class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int n = strs.length;

        Arrays.sort(strs);

        String s1 = strs[0];
        String s2 = strs[n-1];

        int ns1 = s1.length();
        int ns2 = s2.length();

        int i = 0;

        while(i<ns1 && i<ns2){

            if(s1.charAt(i) == s2.charAt(i)){
                i++;
            }

            else{
                break;
            }
        }

        return s1.substring(0,i);
    }
}

/*
Current complexity:O(N∗M∗logN)
Suggested complexity:O(N∗M)
Suggestions:
Switch to vertical scanning to avoid sorting overhead and achieve linear time.
*/
