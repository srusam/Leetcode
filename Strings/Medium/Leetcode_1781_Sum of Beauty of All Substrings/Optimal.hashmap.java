class Solution {
    public int beautySum(String s) {
        
        int n = s.length();
        int sum = 0;

        for(int i=0; i<n; i++){

            Map<Character, Integer> map = new HashMap<>(); //freq map
            
            for(int j=i; j<n; j++){

                char ch = s.charAt(j);

                map.put(ch, map.getOrDefault(ch,0)+1);

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for(int val : map.values()){
                    
                    min = Math.min(min, val);
                    max = Math.max(max, val);
                }

                sum = sum + (max-min);
            }
        }

        return sum;
    }
}
