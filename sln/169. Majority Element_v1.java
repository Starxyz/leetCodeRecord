class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int n : nums) {
            if (map.containsKey(n)) {
                int cnt = map.get(n);
                map.put(n, ++cnt);
                if (cnt > len / 2) return n;
            }                
            else 
                map.put(n, 1);
        }
        
        return nums[0];
    }
}