import java.util.*;

public class Clearer {
    public int[][] clearZero(int[][] mat, int n) {
        // write code here
        boolean[] row = new boolean[mat.length];
        boolean[] col = new boolean[mat[0].length];
        // mark the row & col of zero
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        // clear zero 
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (row[i] || col[j]) {
                    mat[i][j] = 0;
                }
            }
        }
        
        return mat;
    }
}