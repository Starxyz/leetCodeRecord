class Solution {
    public int[] sortArrayByParity(int[] A) {
        int l = 0;
        int r = A.length - 1;
        while (l < r) {
            if (A[l] % 2 != 0) {
                
                if (A[r] % 2 == 0) {
                    int temp = A[l];
                    A[l] = A[r];
                    A[r] = temp;
                    l++;
                }
                r--;
            }
            else {//case [0,2] 、[1, 3], we must always move pointer
                l++;
            }
        }
        
        return A;
    }
}