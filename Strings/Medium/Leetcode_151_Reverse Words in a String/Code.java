class Solution {
    public String reverseWords(String s) {
        
        StringBuilder result = new StringBuilder();

        char[] ca = s.toCharArray();
        int n = ca.length;

        int start = -1;
        int end = -1;

        for(int i=n-1; i>=0; i--){

            char ch = ca[i];

            if( ch == ' '){


                if( start != -1){
                    appendRes(result, ca, start, end);
                    result.append(" ");
                    start = -1;
                    end = -1;
                }

            }

            else{

                    if(end == -1){
                        end = i;
                    }

                    start = i;
                }
        }

        //append the first word separately if there is no space after it as
        //we are only appending after a space is found.
        if(start != -1){
            appendRes(result, ca, start, end);
        }

        //triming for extra spaces at the end
        return result.toString().trim();
    }

    public StringBuilder appendRes(StringBuilder res, char[] ca, int start, int end){
        
        int n = ca.length;

        for(int i=start; i<=end; i++){
            
            char ch = ca[i];
            res.append(ch);
        }

        return res;
    }
}

//TC: O(N)
//SC: O(N)
