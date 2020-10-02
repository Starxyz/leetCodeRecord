class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        heights = [0] + heights + [0] # 统一了第一个元素和最后一个元素的逻辑
        n = len(heights)
        stack = [0]
        res = 0 

        for i in range(1, n):
            while heights[i] < heights[stack[-1]]:
                cur_height = heights[stack.pop()]                
                cur_width = i - stack[-1] - 1   # 注意，以为前面pop一次，考虑一下为什么多减 1
                res = max(res, cur_height* cur_width)
            stack.append(i)
        
        return res
