class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) return false;
        
        int reverseX = 0;
        int temp = x;
        while (temp != 0) {
            reverseX = reverseX * 10 + temp % 10;// if overflow, x is not palindrome
            temp /= 10;
        }
        
        if (reverseX == x) return true;
        return false;
    }
}