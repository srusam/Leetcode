class Solution {
    public boolean isAnagram(String s, String t) {
        
        //converted it to char array
        char[] cs = s.toCharArray(); //TC: O(n)  SC: O(n)
        char[] ct = t.toCharArray(); //TC: O(m)  SC: O(m)

        //sorted it
        Arrays.sort(cs); //TC: O(nlogn)
        Arrays.sort(ct); //TC: O(mlogm)

        //converted back to string
        String sortedc = new String(cs); //TC: O(n)  SC: O(n)
        String sortedt = new String(ct); //TC: O(m)  SC: O(m)

        //they must be equal if they are anagrams of each other
        return sortedc.equals(sortedt); //TC: O( min(n,m) )
    }
}

//Time Complexity: O(n) + O(nlogn) + O(m) + O(mlogm) = O(nlogn + mlogm)
//Space Compllexity: O(n+m)
