class Solution {
    public int countPrimes(int n) {
        if (n < 3) return 0; // less than n means n = 2, count = 0
        
        boolean[] isPrime = new boolean[n];
        int upper = (int)Math.sqrt(n);
        int count = 1;
        for (int i = 3; i < n; i+=2) {
            if (isPrime[i]) continue;
            count++;
            if (i > upper) continue;// avoid isPrime[j] outOfArrayIndex
            
            for (int j = i*i; j < n; j = j + 2 * i) { // sisieve of Eratosthenes algs
                isPrime[j] = true;
            }
        }
        
        return count;
    }
}