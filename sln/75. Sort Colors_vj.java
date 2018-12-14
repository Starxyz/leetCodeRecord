class Solution {
    public void sortColors(int[] nums) {
        
        int zero = -1; // nums[0...zero] = 0
        int two = nums.length; //nums[two...n-1] = 2
        
        for (int i = 0; i < two; ) {
            if (nums[i] == 1) 
                i++;
            else if (nums[i] == 2)
                swap(nums, i, --two);
            else if (nums[i] == 0)
                swap(nums, i++, ++zero);
        }
        
    }
    
    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}