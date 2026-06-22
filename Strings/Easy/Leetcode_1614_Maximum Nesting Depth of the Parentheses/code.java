class Solution {
    public int maxDepth(String s) {
        int n = s.length();

        int p = 0;
        int ans = 0;

        char[] c = s.toCharArray();

        for(int i=0; i<n; i++){
            if(c[i] == '('){
                p++;
            }
            else if(c[i] == ')'){
                p--;
            }
            ans = Math.max(ans,p);
        }

        return ans;
    }
}
