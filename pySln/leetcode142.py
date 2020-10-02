"""
解法1、使用哈希表，存储节点值。遇到重复的节点自然就能直接查询。
"""
# class Solution:
#     def detectCycle(self, head: ListNode) -> ListNode:
#         cur = head
#         d = {}

#         while cur:
#             if cur not in d:
#                 d[cur] = cur.val
#             else:
#                 return cur
            
#             cur = cur.next
        
#         return None

"""
解法2、使用快慢指针
设 f 为快指针走的步数， s 为慢指针走的步数

f = 2s
f = s + nb
所以， f = 2nb
所以， s = nb

设走到链表环入口的地方 k = a + nb 步（注意与s+nb的区别， s+nb只是相遇的地方，相遇不代表是环的入口）
目前slow指针可以根据上面讨论的情况知道，走了 nb 步， 那么slow指针再走a步就到了入口的地方了
从head到入口也是 a 步
所以只要让另一个指针从head与slow一起走a步， 相遇时的节点就是入口

"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = head
        fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                fast = head
                break
        
        while fast and fast.next:# 应对两个特殊用例{0，1} 0； {1} -1
            if slow == fast:
                return fast
            fast = fast.next
            slow = slow.next
            
        
        return None
