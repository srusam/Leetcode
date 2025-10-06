class Solution {
    public int fib(int n) {
        //Base Condition
        if(n<=1){
            return n;
        }
        //Initialization
        int a = 0;
        int b = 1;
        int sum = 0;

        for(int i=2; i<=n; i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
}

// a=0, b=1, sum=0
// i=2 -> sum=1
// a=b -> a=1, b=sum -> b=1
// i=3 -> sum = 2
