"""
解法1、使用哈希表，存储节点值。遇到重复的节点自然就能直接查询。
"""
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        cur = head
        d = {}

        while cur:
            if cur not in d:
                d[cur] = cur.val
            else:
                return cur
            
            cur = cur.next
        
        return None

