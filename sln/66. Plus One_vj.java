class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n-1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // if the for loop end, it means digit[0..n-1] = 0 now
        int[] newNumber = new int[n+1];
        newNumber[0] = 1;
        
        return newNumber;
    }
}