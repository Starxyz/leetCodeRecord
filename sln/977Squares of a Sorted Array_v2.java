class Solution {
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] res = new int[n];
        int l = 0;
        int r = n - 1;
        for (int p = r; p >= 0; p--) {
            if (Math.abs(A[r])> Math.abs(A[l])){
                res[p] = A[r] * A[r];
                r--;
            } 
            else {
                res[p] = A[l] * A[l];
                l++;
            }
        }
        
        return res;
    }
}