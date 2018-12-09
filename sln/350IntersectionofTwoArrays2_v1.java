/*
350. Intersection of Two Arrays II
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Note:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.

*/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
		
        HashMap<Integer, Integer> map = new HashMap<>();
		
        ArrayList<Integer> result = new ArrayList<>();
		
        for (int num : nums1) {
            if (map.containsKey(num))
                map.put(num, map.get(num)+1);
            else
                map.put(num, 1);
        }
        
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0)
            {
                result.add(num); // result is not a map
                map.put(num, map.get(num)-1);
            }
        }
        
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        
        return res;
    }
}