class Solution {
    public void rotate(int[][] matrix) {
        int tR = 0; // top left corner
        int tC = 0;
        int dR = matrix.length - 1; //bottom right corner
        int dC = matrix.length - 1;
        
        while (tR < dR) {
            rotateEdge(matrix, tR++, tC++, dR--, dC--);
        }
        
    }
    
    private void rotateEdge(int[][] m, int tR, int tC, int dR, int dC) {
        int times = dC - tC; 
        int tmp = 0;
        for (int i = 0; i != times; i++) {
            tmp = m[tR][tC+i];
            m[tR][tC+i] = m[dR-i][tC];
            m[dR-i][tC] = m[dR][dC-i];
            m[dR][dC-i] = m[tR+i][dC];
            m[tR+i][dC] = tmp;
        }
    }
}