class Solution {
    public int[] sortedSquares(int[] A) {
        int len = A.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = (int)Math.pow(A[i], 2);
        }
        Arrays.sort(res);
        
        return res;
    }
}