class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int[] charMap = new int[256];
        Arrays.fill(charMap, -1);
        int i = 0;
        int maxLen = 0;
        
        for (int j = 0; j < s.length(); j++) {
            if (charMap[s.charAt(j)] >= i) { // found repeated. update sliding windows
                i = charMap[s.charAt(j)] + 1;
            }
            
            charMap[s.charAt(j)] = j;
            maxLen = Math.max(j - i + 1, maxLen);
        }
        
        return maxLen;
    }
}