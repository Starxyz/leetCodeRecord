class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        
        for (int i = 0; i < nums.length-2; i++) {
            if (i == 0 || (i > 0) && nums[i] != nums[i-1]) {
                int l = i + 1;
                int r = nums.length - 1;// two pointer for 2-sum
                int sum = 0 - nums[i];
                while (l < r) {
                    if (nums[l] + nums[r] == sum) {
                        res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[l+1]) l++;
                        while (l < r && nums[r] == nums[r-1]) r--;
                        l++;
                        r--;// 3-sum consume 3 elements
                    } 
                    else if (nums[l] + nums[r] < sum) l++;
                    else r--;
                }
            }
        }
        
        return res;
    }
}