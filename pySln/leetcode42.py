"""
栈
到遇到比栈顶高的， 把前面的都出栈，知道栈空，每次在出栈后计算雨水
"""

class Solution:
    def trap(self, height: List[int]) -> int:
        res = 0
        stack = []

        for i, x in enumerate(height):
            while stack and height[i] > height[stack[-1]]:
                h = height[stack.pop()]
                if not stack:
                    break
                width = i - stack[-1] -1
                res += width * (min(height[i], height[stack[-1]]) - h)
            
            stack.append(i)


    
        return res
