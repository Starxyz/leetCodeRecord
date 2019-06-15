class Solution {
    public int fib(int N) {
        return _fib(N);
    }
    
    private int _fib(int N) {
        if (N == 0 || N == 1)
            return N;
        return _fib(N-1) + _fib(N-2);
    }
}