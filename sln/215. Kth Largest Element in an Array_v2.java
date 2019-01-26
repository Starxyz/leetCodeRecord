class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();//min queue
        for (int val : nums) {
            pq.add(val);
            if (pq.size() > k) {
                pq.poll();// delete
            }
        }
        
        return pq.peek();
    }
}