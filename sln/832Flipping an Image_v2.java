class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        for (int i = 0; i < A.length; i++) {
            int l = 0;
            int r = A[i].length - 1;
            while (l <= r) {
                if (A[i][l] == A[i][r]) {
                    A[i][l] = 1 - A[i][r];
                    A[i][r] = A[i][l];
                }
                l++;
                r--;
            }
        }
        
        return A;
    }
}

/* example
1,1,0,0 -->
0,0,1,1 -->
1,1,0,0
so if a[l] != a[r], we don't need to do anything
*/