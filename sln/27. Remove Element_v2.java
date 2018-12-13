class Solution {
    public int removeElement(int[] nums, int val) {
        
        int k = 0; // index of first val
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (i != k) swap(nums, i, k);
                k++;                
            }
            //if (k != i) 
        }
        
        return k;
    }
    
    private void swap(int[] arr, int a, int b) {
        if (arr.length < 2) return;
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}