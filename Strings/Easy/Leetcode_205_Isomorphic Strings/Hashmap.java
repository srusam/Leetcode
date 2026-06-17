class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int n = s.length();

        /*
            key: char from s
            value: char from t mapped to the char of s
        */
        Map<Character, Character> map = new HashMap<>();

        // char from t that is already mapped to some char of s
        Set<Character> used = new HashSet<>();

        for(int i=0; i<n; i++){

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            //if map has key c1, check if the value associated to it is equal to c2
            if(map.containsKey(c1)){

                if(map.get(c1) != c2){
                    return false;
                }
            }

            else{
                
                // if c2 is already present in used, but it's key is not present in the map, that means the c2 is mapped to a different character already.
                if(used.contains(c2)){
                    return false;
                }

                //update the map and used with the current elements
                map.put(c1,c2);
                used.add(c2);
            }
        }

        return true;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)
