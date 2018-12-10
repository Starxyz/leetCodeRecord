class Solution {
    public String reverseWords(String s) {
        if (s == null) return null;
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            char[] w = words[i].toCharArray();
            reverse(w);
            sb.append(new String(w) + " ");
        }
        
        return sb.toString().trim();
    }
    
    private void reverse(char[] w) {
        int l = 0;
        int r = w.length-1;
        while (l < r) {
            char temp = w[l];
            w[l] = w[r];
            w[r] = temp;
            
            l++;
            r--;
        }
    }
}
