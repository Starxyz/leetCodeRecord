/*
1. reverse row
2. inverse value
*/

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            reverseHorizontally(A[i]);
        }
        
        invertImage(A);
        return A;
        
    }
    
    private void reverseHorizontally(int[] arr) {
        int r = arr.length - 1;
        int len = arr.length;
        for (int i = 0; i < len/2; i++) {
            int temp = arr[i];
            arr[i] = arr[r];
            arr[r--] = temp;
        }
    }
    
    private void invertImage(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j] = 0;
                }
            }
        }
    }
}
