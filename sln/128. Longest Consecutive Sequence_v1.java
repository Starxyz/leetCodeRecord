class Solution {
    public int longestConsecutive(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
        }
        if (pq.isEmpty()) return 0; // promise pq.peek() is valid
        
        int maxLen = 0;
        int count = 0;
        for (int i = pq.peek(); !pq.isEmpty(); i++) {            
            if (i != pq.peek()) {
                maxLen = Math.max(maxLen, count);
                if (i == pq.peek() + 1)
                    count--;// skip duplicates
                else {
                    count = 0;                    
                }
                i = pq.peek();
            }
            count++;
            pq.poll();
        }
        maxLen = Math.max(maxLen, count);
        return maxLen;
    }
}