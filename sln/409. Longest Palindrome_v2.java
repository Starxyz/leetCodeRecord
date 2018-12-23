class Solution {
    public int longestPalindrome(String s) {
        
        if (s == null || s.length() < 1) return 0;
        
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
                count++;
            }
            else {
                set.add(s.charAt(i));
            }
        }
        // if s = aaabbb, length = 5, we can produce palindrome
        if (!set.isEmpty()) return count * 2 + 1;
        return count * 2;
    }
}