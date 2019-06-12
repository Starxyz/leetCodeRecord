class Solution {
    public int[] sortArrayByParity(int[] A) {
        for (int i = 0, j = 0; j < A.length; j++) {
            if (A[j] % 2 == 0) {
                int temp = A[i];
                A[i++] = A[j];//after that, a[i] = odd
                A[j] = temp;
            }
        }
        
        return A;
    }
}
//[3,1,2,4]
//i=0,j=0,[3,1,2,4]
//i=0,j=1,[3,1,2,4]
//i=0,j=2,temp = 3, [2,1,3,4]
//i=1,j=3,temp = 1, [2,4,3,1]
//done