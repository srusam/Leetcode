class Solution {
    public int fib(int n) {
        //Base Condition
        if(n<=1){
            return n;
        }
        //Recursive Calls
        return fib(n-1)+fib(n-2);
    }
}
