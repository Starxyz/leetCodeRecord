class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        
        int count = 0;
        for (int num : set) {
            if (!set.contains(num-1)) {// uncontinuous point
                int cur = num;
                int curStreak = 1;
                // calculate length
                while (set.contains(cur+1)) {
                    cur++;
                    curStreak++;
                }
                
                count = Math.max(count, curStreak);
            }
        }
        
        return count;
    }
}