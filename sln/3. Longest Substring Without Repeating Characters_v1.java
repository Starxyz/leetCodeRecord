class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if (s.length() == 0) return 0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        
        for (int i = 0, j = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                j = Math.max(j, map.get(c) + 1);
                // if we don't "+1"
                // "abca" 3-0+1 = 4 while we expect result = 3
            }
            map.put(c, i);
            max = Math.max(max, i - j + 1);
        }
        
        return max;
    }
}