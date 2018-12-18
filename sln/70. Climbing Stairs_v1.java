class Solution {
    
    public int climbStairs(int n) {
        
        res = new int[n+1];
        return f(n);              
    }
    // f(1) = 1
    // f(2) = 1
    // f(n) = f(n-1) + f(n-2);
    // if we climb 1 step firstly, we have f(n-1) ways to climb later;
    // if we climb 2 steps firstly, we have f(n-2) ways to climber later;
    private int[] res;
    
    private int f(int n) {
        
        if (res[n] != 0) return res[n]; 
        
        if (n == 1 || n == 2) res[n] = n;
        else res[n] =  f(n-1) + f(n-2);
        
        return res[n];
    }
}