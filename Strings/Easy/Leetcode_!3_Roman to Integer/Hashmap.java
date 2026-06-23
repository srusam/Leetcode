class Solution {
    public int romanToInt(String s) {
        
        int n = s.length();

        int ans = 0;

        Map<Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        //iterating over the string except the last character as we have nothing ahead to compare it with so we will add it directly
        for(int i=0; i<n-1; i++){

            char current = s.charAt(i);
            char next = s.charAt(i+1);

            if(map.get(current) < map.get(next)){
                ans = ans - map.get(current);
            }

            else{
                ans = ans + map.get(current);
            }
        }

        //add the last roman character value
        ans = ans + map.get(s.charAt(n-1));

        return ans;
    }
}

//TC: O(N)
//SC: O(1)
