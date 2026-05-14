class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder result = new StringBuilder();

        char[] cArr = s.toCharArray();

        int level = 0;

        for(int i=0; i<cArr.length; i++){

            char ch = cArr[i];

            if(ch == '('){

                if(level > 0){
                    result.append(ch);
                }

                level++;
            }

            else{ //ch == ')'

                level--;

                if(level > 0){
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}

//TC: O(N)
//SC: O(1)
