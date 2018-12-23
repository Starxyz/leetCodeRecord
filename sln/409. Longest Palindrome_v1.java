class Solution {
    public int longestPalindrome(String s) {
        
        if (s == null || s.length() < 1) return 0;
        
        int[] count = new int[256];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        
        int odd = 0;
        for (int n : count) {
            if (n % 2 != 0) {
                odd++;
            }
        }
        
        return odd == 0 ? s.length() : s.length() - odd + 1; // only tolerate one char with odd number
    }
}