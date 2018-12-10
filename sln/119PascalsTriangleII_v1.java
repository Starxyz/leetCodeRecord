class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex < 0) return null;
        int[] res = new int[rowIndex+1];
        
        res[0] = 1;
        for (int i = 1; i < rowIndex + 1; i++) {
            for (int j = i; j >= 1; j--) {
                res[j] += res[j-1];
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for (int n : res) {
            list.add(n);
        }
        return list;
        
    }
}
