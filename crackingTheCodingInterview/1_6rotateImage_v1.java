import java.util.*;

public class Transform {
    public int[][] transformImage(int[][] mat, int n) {
        // write code here
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = mat[first][i];
                // left to up
                mat[first][i] = mat[last-offset][first];
                // bottom to left
                mat[last-offset][first] = mat[last][last-offset];
                // right to bottom
                mat[last][last-offset] = mat[i][last];
                // up to right
                mat[i][last] = top;
            }
        }
        
        return mat;
    }
}