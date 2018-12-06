/*14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0, pre.length()-1);
            /**
              * If the first cycle is completed, aimPrefix.length() == 0 is true
              * it's mean there is no longest prefix surely
              */
            if (pre.length() == 0) 
                return "";
            else 
                i++;
        }
        return pre;
        
    }
}
/* 第二个循环作用
当pre不是strs[i]的前缀时， pre删除最后一位，继续下一次循环，这样就可以找到最长前缀
if条件能减少很多不必要的比较，因为只要有一个字符串不包含前缀，代表strs没有公共前缀
	
*/