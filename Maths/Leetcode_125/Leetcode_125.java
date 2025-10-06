class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){

            char currentChar = s.charAt(i);
           
            if(Character.isLetterOrDigit(currentChar)){
    
                sb.append(Character.toLowerCase(currentChar));

            }
        }

        int Start = 0;
        int End = sb.length()-1;

        while(Start<End){
            if(sb.charAt(Start)!=sb.charAt(End)){
                return false;
            }
            Start++;
            End--;
        }

        return true;
    }
}
