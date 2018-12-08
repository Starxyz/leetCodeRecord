/*344. Reverse String
Write a function that takes a string as input and returns the string reversed.

Example 1:

Input: "hello"
Output: "olleh"
Example 2:

Input: "A man, a plan, a canal: Panama"
Output: "amanaP :lanac a ,nalp a ,nam A"
*/
class Solution {
    public String reverseString(String s) {
        int length = s.length();
        
        int n = length - 1;
        char[] reverseString = s.toCharArray();
        for (int i = 0; i < length/2; i++) {
            reverseString[i] = s.charAt(n);
            reverseString[n] = s.charAt(i);
            n--;
        }
        return new String(reverseString);
    }
}
// length/2 不需要交换
// example
// abcde
// ebcda
// edcba

// abcd
// dbca
// dcba