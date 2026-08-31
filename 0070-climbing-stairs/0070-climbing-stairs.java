class Solution {
    public int climbStairs(int n) {
        int count=0;
        if(n<=2){
            return n;
        }
        int a = 1; 
        int b = 2; 

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
} 