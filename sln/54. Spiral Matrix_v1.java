class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> elements = new ArrayList<>();
        if (matrix.length == 0) return elements;
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = -1;
        
        while (true) {
            for (int i = 0; i < n; i++) {
                elements.add(matrix[row][++col]);
            }
            if (--m == 0) break;
            
            for (int i = 0; i < m; i++) {
                elements.add(matrix[++row][col]);
            }
            if (--n == 0) break;
            
            for (int i = 0; i < n; i++) {
                elements.add(matrix[row][--col]);
            }
            if (--m == 0) break;
            
            for (int i = 0; i < m; i++) {
                elements.add(matrix[--row][col]);
            }
            if (--n == 0) break;
        }
        
        return elements;
    }
}