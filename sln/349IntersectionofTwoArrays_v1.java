/*349. Intersection of Two Arrays
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Note:

Each element in the result must be unique.
The result can be in any order.
*/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();

        for (int i : nums1)
            set.add(i);
        
        for (int i : nums2) {
            if(set.contains(i)) {
                intersect.add(i);
                set.remove(i);
            }
                
        }
        int[] res = new int[intersect.size()];
        int i = 0;
        for(Integer num : intersect)
            res[i++] = num;
        
        return res;
    }
}