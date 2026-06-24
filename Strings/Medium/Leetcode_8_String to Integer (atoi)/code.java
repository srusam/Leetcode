class Solution {
    public int myAtoi(String s) {
        
        s = s.trim(); //remove the leading whitespaces

        int n = s.length();

        int sign = 1; //set the sign as 1 (positive) initially

        int i=0;

        long ans = 0L; //long to handle overflow

        if(n==0){ //base case
            return 0;
        }

        if(s.charAt(i) == '-'){ //handle the negative sign
            sign = -1;
            i++; //move to the next i and don't tolerate any signs further
        }

        else if(s.charAt(i) == '+'){ //handle the positive sign
            i++; //move to the next i and don't tolerate any signs further
        }

        while(i<n){ //handle the numerical part

            char ch = s.charAt(i);

            //Option 1
            if( ch<'0' || ch>'9'){
                break; //stop at non-numerical value
            }

            //Option 2
            /*
            if( !Character.isDigit(ch)){
                break;
            }
            */

            ans = ans*10 + (ch-'0'); //convert char to number and add the digit to ans

            //handling overflows
            if(sign*ans > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

            if(sign*ans < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            } 

            i++;
        }

        return (int) (sign*ans);
    }
}
